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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
	 @RequestMapping(value = "/allcases", method = RequestMethod.GET)
	public Case getAll() throws Exception {
        try {
		
			String url = "jdbc:mysql://techspartans.mysql.database.azure.com:3306/spartans";
			String user = "admintech";
			String password = "Tech@bar";
			
			Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM cases";
            ResultSet resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
                String column1 = resultSet.getString("firstName");
                String column2 = resultSet.getString("surname");
                // Process the retrieved data
                System.out.println("Column 1: " + column1 + ", Column 2: " + column2);
            }

            resultSet.close();
            statement.close();
            connection.close();
		
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
