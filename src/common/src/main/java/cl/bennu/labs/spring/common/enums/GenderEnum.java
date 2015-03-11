package cl.bennu.labs.spring.common.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public enum GenderEnum {

    MALE("Masculino", 1L)
    , FEMALE("Femenino", 2L)
    ;

    private static Map<Long, GenderEnum> valuesMap = new HashMap<Long, GenderEnum>();

    static {
        for (GenderEnum typeEnum : values()) {
            valuesMap.put(typeEnum.getId(), typeEnum);
        }
    }

    private final String name;
    private final Long id;

    GenderEnum(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public static List<GenderEnum> valuesList() {
        return Arrays.asList(GenderEnum.values());
    }

    public static GenderEnum valueOf(Long id) {
        GenderEnum typeEnum = valuesMap.get(id);
        if (typeEnum == null) {
            throw new IllegalArgumentException("Illegal argument, id:" + id);
        }
        return typeEnum;
    }

}
