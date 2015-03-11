package cl.bennu.labs.spring.core.business.impl;


import cl.bennu.labs.spring.common.domain.Demo;
import cl.bennu.labs.spring.common.dto.ContextDTO;
import cl.bennu.labs.spring.core.business.iface.IDemoService;


public class DemoService implements IDemoService {

    private final static IDemoService instance = new DemoService();


    public static synchronized IDemoService getInstance() {
        return instance;
    }


    private DemoService() {
    }

    @Override
    public void method1(ContextDTO contextDTO, Demo demo) {
        //logica de negocio

    }

}
