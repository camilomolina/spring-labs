package cl.bennu.labs.spring.core.business.batch;

import cl.bennu.labs.spring.core.business.iface.IDemoService;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;


public class ControlTimer extends BaseQuartz {

    private IDemoService controlService;
/*
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        try {
            //
        } catch (Exception e) {
            System.out.println("Error en ControlTimer" + e.getCause());
        }
    }
*/
    public IDemoService getControlService() {
        return controlService;
    }

    public void setControlService(IDemoService controlService) {
        this.controlService = controlService;
    }
}
