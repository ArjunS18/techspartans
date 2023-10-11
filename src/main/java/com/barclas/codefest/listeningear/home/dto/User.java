package com.barclas.codefest.listeningear.home.dto;

import javax.persistence.Entity;

@Entity
public class User {
    public User(){}

    public User(String username, String password, Long userid){
        this.username = username;
        this.password = password;
        this.userid = userid;
    }

    private String username;

    private String password;

    private Long userid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
