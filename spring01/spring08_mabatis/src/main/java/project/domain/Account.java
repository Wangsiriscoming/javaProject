package project.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsernameName() {
        return username;
    }

    public void setUsernameName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", money=" + password +
                '}';
    }
}

