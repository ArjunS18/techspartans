package com.barclas.codefest.listeningear.cases.Repository;

import com.barclas.codefest.listeningear.cases.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Case, Long> {
}

