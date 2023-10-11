package com.barclas.codefest.listeningear.cases.dto;

import com.barclas.codefest.listeningear.referrals.model.Referral;

import java.util.List;

public class ResultDTO{
    private List<Referral> referrals;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Referral> getReferrals() {
        return referrals;
    }

    public void setReferrals(List<Referral> referrals) {
        this.referrals = referrals;
    }
}