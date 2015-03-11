package cl.bennu.labs.spring.converter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.struts2.util.StrutsTypeConverter;

import java.lang.reflect.Method;
import java.util.Map;

public class EnumTypeConverter extends StrutsTypeConverter {

    private static final String DEFAULT_IDENTIFIER_METHOD_NAME = "getId";
    private static final String DEFAULT_VALUE_OF_METHOD_NAME = "valueOf";

    public EnumTypeConverter() {
        super();
    }

    
    public Object convertFromString(Map context, String[] values, Class toClass) {
        String value = values[0];
        if (value != null && value.length() > 0) {
            try {
                Class<?> identifierType = toClass.getMethod(DEFAULT_IDENTIFIER_METHOD_NAME).getReturnType();
                Method valueOfMethod = toClass.getMethod(DEFAULT_VALUE_OF_METHOD_NAME, identifierType);
                return valueOfMethod.invoke(null, ConvertUtils.convert(value, identifierType));
            } catch (Exception e) {
                throw new TypeConversionException("Error al convertir String " + value + " a Enum");
            }
        }

        return null;
    }

    public String convertToString(Map context, Object o) {
        try {
            Method identifierMethod = o.getClass().getMethod(DEFAULT_IDENTIFIER_METHOD_NAME);
            return identifierMethod.invoke(o).toString();
        } catch (Exception e) {
            return null;
        }
    }

}
