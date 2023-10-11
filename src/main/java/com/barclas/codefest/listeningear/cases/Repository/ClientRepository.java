package com.barclas.codefest.listeningear.cases.Repository;

import com.barclas.codefest.listeningear.cases.model.Case;
import com.barclas.codefest.listeningear.cases.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    int countByClientId(String clientId);
}
