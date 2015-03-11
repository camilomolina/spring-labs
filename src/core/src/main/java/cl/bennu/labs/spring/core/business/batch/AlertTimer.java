package cl.bennu.labs.spring.core.business.batch;

import cl.bennu.labs.spring.core.business.iface.IDemoService;


public class AlertTimer extends BaseQuartz {

    private IDemoService demoService;

/*
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        try {
            //
        } catch (Exception e) {
            System.out.println("Error en AlertTimer" + e.getCause());
        }
    }
*/
    public IDemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(IDemoService demoService) {
        this.demoService = demoService;
    }
}
