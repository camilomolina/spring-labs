package cl.bennu.labs.spring.common.domain;

import java.io.Serializable;

public class BaseDomain implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
