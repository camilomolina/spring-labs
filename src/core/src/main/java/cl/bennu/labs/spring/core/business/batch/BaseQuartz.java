package cl.bennu.labs.spring.core.business.batch;

import cl.bennu.labs.spring.common.domain.Demo;
//import org.springframework.scheduling.quartz.QuartzJobBean;


public abstract class BaseQuartz //extends QuartzJobBean
{
    public static Demo buildContext() {
        Demo demo = new Demo();
        demo.setUser("user");
        demo.setPass("****");
        return demo;
    }
}
