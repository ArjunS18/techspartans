package com.barclas.codefest.listeningear.referrals.model;

import com.barclas.codefest.listeningear.cases.model.Case;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "client",schema = "spartans")
public class Client {

    @Id
    @Column(name = "clientId")
    private String clientId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "dob")
    private String dob;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "phoneBo")
    private String phoneNo;

    @OneToMany(mappedBy = "client")
    private List<Case> cases;

    @Column(name = "lastUpdated")
    private Timestamp lastUpdated;

    public Client(String firstName, String surname, String dob, String address1, String address2, String phoneNo, Timestamp lastUpdated) {
        this.clientId = firstName + "_" + surname + "_" + dob;
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.address1 = address1;
        this.address2 = address2;
        this.phoneNo = phoneNo;
        this.lastUpdated = lastUpdated;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = this.firstName + "_" + this.surname + "_" + this.dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }
}