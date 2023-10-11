package com.barclas.codefest.listeningear.cases.dto;

import jakarta.persistence.Entity;

@Entity
public class Case {
    public Case(){}

    public Case(String username, String password, Long userid){
        this.username = username;
        this.password = password;
        this.userid = userid;
    }

    private String username;

    private String password;

    private Long caseid;

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
