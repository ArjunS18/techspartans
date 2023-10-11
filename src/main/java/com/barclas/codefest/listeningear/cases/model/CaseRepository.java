package com.barclas.codefest.listeningear.cases.model;

import com.barclas.codefest.listeningear.cases.dto.Case;
import com.barclas.codefest.listeningear.cases.dto.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {

}
