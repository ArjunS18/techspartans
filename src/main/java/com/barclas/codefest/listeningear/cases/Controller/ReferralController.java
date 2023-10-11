package com.barclas.codefest.listeningear.cases.Controller;

import com.barclas.codefest.listeningear.cases.dto.ResultDTO;
import com.barclas.codefest.listeningear.cases.services.ReferralService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@CrossOrigin
@RequestMapping("/User")
public class ReferralController {
    @Autowired
    ReferralService referralService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResultDTO getAllReferrals() {
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setReferrals(referralService.getAllReferrals());
        } catch (Exception ex) {
            resultDTO.setStatus("0");
        }
        return resultDTO;
    }
}