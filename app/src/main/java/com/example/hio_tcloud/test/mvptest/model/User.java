package com.example.hio_tcloud.test.mvptest.model;

import java.io.Serializable;

public class User implements Serializable {     //2.1  17 implements Serializable
    private String userName;                    //2,1  18
    private String password;                    //2.1  19
    //2.1  20 gnerate, getter and setter, choose all (getUser, set User)
    //2.1  21 go MainActivity to write


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
