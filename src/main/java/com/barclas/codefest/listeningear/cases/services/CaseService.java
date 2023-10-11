package com.barclas.codefest.listeningear.cases.services;

import com.barclas.codefest.listeningear.cases.Repository.CaseRepository;
import com.barclas.codefest.listeningear.cases.Repository.ReferralRepository;
import com.barclas.codefest.listeningear.cases.Repository.EmployeeRepository;
import com.barclas.codefest.listeningear.cases.model.Case;
import com.barclas.codefest.listeningear.cases.model.Client;
import com.barclas.codefest.listeningear.cases.model.Employee;
import com.barclas.codefest.listeningear.referrals.model.Referral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.Timestamp;

@Service
public class CaseService {
    @Autowired
    ReferralRepository referralsRepository;

    @Autowired
    CaseRepository caseRepository;

    @Transactional
    public Object createCase (Referral referral) throws Exception {
        try {
            Case newCase = new Case();
            newCase.setFirstName(referral.getFirstName());
            newCase.setSurname(referral.getSurname());
            newCase.setClient(client);
            return referral;
        } catch (Exception ex) {
            throw new Exception("Exception occurred in while creating Referral!");
        }
    }

    public Case CreateCase(Referral referral) throws Exception {
        try {

        } catch (Exception e) {
            throw new Exception("Exception occurred while fetching all referrals!");
        }
    }

    public Case assignDoctor(Integer caseId) throws Exception {
        try {
            Case response = caseRepository.findAllByCaseId(caseId);
            Employee employee = EmployeeRepository.findAllBy
            //response.setEmployee();
            return response;
        } catch (Exception e) {
            throw new Exception("Exception occurred while fetching new referrals!");
        }
    }

