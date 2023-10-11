package com.barclas.codefest.listeningear.cases.model;

import javax.persistence.*;

@Entity
@Table(name = "Access",schema = "spartans")
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@SequenceGenerator(name="id_generator")
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(optional=false)
    @JoinColumn(name="userId",referencedColumnName="userId", insertable=false, updatable=false)
    private Integer userId;

    @Column(name = "role")
    private String role;

    @Column(name = "accessType")
    private Integer accessType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAccessType() {
        return accessType;
    }

    public void setAccessType(Integer accessType) {
        this.accessType = accessType;
    }
}

