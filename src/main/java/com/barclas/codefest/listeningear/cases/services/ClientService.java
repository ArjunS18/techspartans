package com.barclas.codefest.listeningear.cases.services;

import com.barclas.codefest.listeningear.cases.Repository.CaseRepository;
import com.barclas.codefest.listeningear.cases.Repository.ReferralRepository;
import com.barclas.codefest.listeningear.cases.Repository.ClientRepository;
import com.barclas.codefest.listeningear.cases.model.Case;
import com.barclas.codefest.listeningear.cases.model.Client;
import com.barclas.codefest.listeningear.cases.model.Employee;
import com.barclas.codefest.listeningear.referrals.model.Referral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ReferralRepository referralsRepository;

    @Autowired
    ClientRepository ClientRepository;


    @Transactional
    public Client createClient (Referral referral) throws Exception {
        try {
            Client newClient = new Client();
            String clientId = referral.getFirstName() + "_" + referral.getSurname() + "_" + referral.getDob();
            if (ClientRepository.countByClientId(clientId) == 0) {
                newClient.setClientId(clientId);
                newClient.setFirstName(referral.getFirstName());
                newClient.setSurname(referral.getSurname());
                newClient.setDob(referral.getDob());
                newClient.setAddress1(referral.getAddress1());
                newClient.setAddress2(referral.getAddress2());
                newClient.setPhoneNo(referral.getPhoneNo());
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                newClient.setCreatedOn(timestamp);
                newClient.setLastUpdated(timestamp);
                return newClient;
            }
            else {
                throw new Exception("Referral for client already exists!");
            }
        } catch (Exception ex) {
            throw new Exception("Exception occurred in while creating Referral!");
        }
    }

    public List<Case> getAllCases(Integer clientId) throws Exception {
        try {
            List<Case> response = CaseRepository.findAllByClientId(clientId);
            return response;
        } catch (Exception e) {
            throw new Exception("Exception occurred while fetching new referrals!");
        }
    }
}
