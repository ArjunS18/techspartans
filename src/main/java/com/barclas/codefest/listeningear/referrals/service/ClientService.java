package com.barclas.codefest.listeningear.referrals.service;

import com.barclas.codefest.listeningear.cases.model.CaseRepository;
import com.barclas.codefest.listeningear.referrals.model.ReferralRepository;
import com.barclas.codefest.listeningear.referrals.model.ClientRepository;
import com.barclas.codefest.listeningear.cases.dto.Case;
import com.barclas.codefest.listeningear.referrals.model.Client;
//import com.barclas.codefest.listeningear.cases.model.Employee;
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
                newClient.setAlternateName(referral.getFirstName() + "_" + referral.getSurname() + "_" + referral.getDob());
                return newClient;
            }
            else {
                throw new Exception("Referral for client already exists!");
            }
        } catch (Exception ex) {
            throw new Exception("Exception occurred in while creating Referral!");
        }
    }


}
