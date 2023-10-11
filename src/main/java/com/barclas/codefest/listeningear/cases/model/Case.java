package com.barclas.codefest.listeningear.cases.model;

import com.barclas.codefest.listeningear.referrals.model.Client;
import com.barclas.codefest.listeningear.referrals.model.Referral;
import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Case",schema = "spartans")
public class Case {

    @Id
    @Column(name = "caseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer caseId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @OneToOne(optional = false)
    @JoinColumn(name = "clientId", referencedColumnName = "clientId", insertable = false, updatable = false)
    private Client client;

    @OneToOne(optional = false)
    @JoinColumn(name = "referralId", referencedColumnName = "referralId", insertable = false, updatable = false)
    private Referral referral;

    @OneToOne(optional = true)
    @JoinColumn(name = "doctorId", referencedColumnName = "userId", insertable = false, updatable = false)
    private Employee employee;

    @Column(name = "creationDate")
    private Timestamp creationDate;

    @Column(name = "status")
    private String status;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Referral getReferral() {
        return referral;
    }

    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

