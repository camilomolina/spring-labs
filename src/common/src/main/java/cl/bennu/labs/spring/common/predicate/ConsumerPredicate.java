package cl.bennu.labs.spring.common.predicate;

import cl.bennu.labs.spring.common.domain.Demo;
import org.apache.commons.collections.Predicate;


public class ConsumerPredicate implements Predicate {

    private String user;

    public ConsumerPredicate(String user) {
        this.user = user;
    }

    @Override
    public boolean evaluate(Object o) {
        if (o instanceof Demo) {
            return ((Demo) o).getUser().equals(this.user);
        }
        return false;
    }

}
