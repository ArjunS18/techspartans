package com.barclas.codefest.listeningear.referrals.web;

import com.barclas.codefest.listeningear.referrals.dto.ReferralDto;
import com.barclas.codefest.listeningear.referrals.model.Referral;
import com.barclas.codefest.listeningear.referrals.service.ReferralService;
import com.barclas.codefest.listeningear.referrals.dto.ReferralDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/referral")
public class ReferralController {
    @Autowired
    ReferralService referralService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Referral> getAllReferrals() {
        try {
            return referralService.getAllReferrals();
        } catch (Exception ex) {
            return new ArrayList<Referral>();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Referral getReferralById(@PathParam("id") Long id) throws Exception {
            return referralService.getReferralById(id);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Referral approveReferral(@PathParam("id") Long id) throws Exception {
           return referralService.approveReferral(id);

    }
}