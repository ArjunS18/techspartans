package com.barclas.codefest.listeningear.cases.Repository;

import com.barclas.codefest.listeningear.cases.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepository extends JpaRepository<Case, Long> {
    List<Case> findAllByClientId(Integer clientId);
    Case findAllByCaseId(Integer caseId);
    List findAllByClientId(Integer clientId);
}

