package cl.bennu.labs.spring.common.domain;

import cl.bennu.labs.spring.common.enums.GenderEnum;

public class Demo extends BaseDomain {

    private String user;
    private String pass;
    private GenderEnum genderEnum;


    public GenderEnum getGenderEnum() {
        return genderEnum;
    }

    public void setGenderEnum(GenderEnum genderEnum) {
        this.genderEnum = genderEnum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
