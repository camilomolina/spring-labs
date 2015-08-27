package cl.bennu.labs.spring.core.business.impl;


import cl.bennu.labs.spring.common.domain.Demo;
import cl.bennu.labs.spring.common.dto.ContextDTO;
import cl.bennu.labs.spring.common.mail.MailHelper;
import cl.bennu.labs.spring.core.business.iface.IDemoService;
import org.apache.commons.mail.HtmlEmail;


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

    @Override
    public void sendMail(ContextDTO contextDTO, String to) {
        String from = "no-reply@cdsp.cl";
        String host = "smtp.office365.com";
        String fromAlias = "";
        String user = "no-reply@cdsp.cl";
        String pass = "Manquehue01";
        int port = 587;
        boolean ssl = false;
        boolean tls = true;

        try {
            HtmlEmail email = MailHelper.buildHtmlEmail(host, port, ssl, tls, from, fromAlias, user, pass);

            email.setSubject("Test");
            email.addTo(to);
            //email.addTo("camilo.molina.orth@gmail.com");
            email.setHtmlMsg("<html><body>Test HTML Mail</body></html>");

            email.send();
        } catch (Exception e) {
               // error
        }
    }

}
