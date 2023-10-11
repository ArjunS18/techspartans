package com.barclas.codefest.listeningear.referrals.model;

import com.barclas.codefest.listeningear.cases.model.Case;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "referral",schema = "spartans")
public class Referral {

    @Id
    @Column(name = "referralId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer referralId;

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

    @Column(name = "phoneNo")
    private String phoneNo;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "gpSurgeryName")
    private String gpSurgeryName;

    @Column(name = "gpSurgeryAddress")
    private String gpSurgeryAddress;

    @Column(name = "gpSurgeryPhoneNo")
    private String gpSurgeryPhoneNo;

    @Column(name = "lastUpdated")
    private Timestamp lastUpdated;

    @OneToOne(mappedBy = "referral")
    private Case caseHistory;

    public Integer getReferralId() {
        return referralId;
    }

    public void setReferralId(Integer referralId) {
        this.referralId = referralId;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getGpSurgeryName() {
        return gpSurgeryName;
    }

    public void setGpSurgeryName(String gpSurgeryName) {
        this.gpSurgeryName = gpSurgeryName;
    }

    public String getGpSurgeryAddress() {
        return gpSurgeryAddress;
    }

    public void setGpSurgeryAddress(String gpSurgeryAddress) {
        this.gpSurgeryAddress = gpSurgeryAddress;
    }

    public String getGpSurgeryPhoneNo() {
        return gpSurgeryPhoneNo;
    }

    public void setGpSurgeryPhoneNo(String gpSurgeryPhoneNo) {
        this.gpSurgeryPhoneNo = gpSurgeryPhoneNo;
    }
}
