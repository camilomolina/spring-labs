package cl.bennu.labs.spring.web;


import cl.bennu.labs.spring.base.BaseAction;
import cl.bennu.labs.spring.bean.DemoBean;
import cl.bennu.labs.spring.common.domain.Demo;
import cl.bennu.labs.spring.common.dto.ContextDTO;
import cl.bennu.labs.spring.common.enums.GenderEnum;
import cl.bennu.labs.spring.core.business.iface.IDemoService;

/**
 * Created with IntelliJ IDEA.
 * User: _Camilo
 * Date: 03-07-13
 * Time: 03:21 AM
 */
public class DemoAction extends BaseAction {

    private final static String HOME_CONTROL_SUCCESS = "homeControlSuccess";
    private final static String CONFIGURATION_SUCCESS = "configurationSuccess";
    private final static String REPORT_SUCCESS = "reportSuccess";


    private DemoBean demoBean = new DemoBean();

    private IDemoService demoService;

    @Override
    protected void initial() throws Exception {
    }

    public String start() throws Exception {
        // action de inicio
        ContextDTO contextDTO = getContext();

        demoService.sendMail(contextDTO, demoBean.getTo());

        return SUCCESS;
    }

    public DemoBean getDemoBean() {
        return demoBean;
    }

    public void setDemoBean(DemoBean demoBean) {
        this.demoBean = demoBean;
    }

    public IDemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(IDemoService demoService) {
        this.demoService = demoService;
    }
}
