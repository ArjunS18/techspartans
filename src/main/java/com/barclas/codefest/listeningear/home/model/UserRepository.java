package com.barclas.codefest.listeningear.home.model;

import com.barclas.codefest.listeningear.home.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
