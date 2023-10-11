package com.barclas.codefest.listeningear.cases.web;

import com.barclas.codefest.listeningear.cases.dto.Case;
import com.barclas.codefest.listeningear.cases.model.CaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CaseController {

    private final CaseRepository caseRepository;

    public CaseController(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Case createTodo(@RequestBody Case todo) {
        return caseRepository.save(todo);
    }

//    @GetMapping("/users")
//    public Iterable<User> getTodos() {
//        return userRepository.findAll();
//    }


}
