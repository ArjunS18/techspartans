package com.barclas.codefest.listeningear.home.web;

import com.barclas.codefest.listeningear.home.dto.User;
import com.barclas.codefest.listeningear.home.model.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public User createTodo(@RequestBody User todo) {
        return userRepository.save(todo);
    }

//    @GetMapping("/users")
//    public Iterable<User> getTodos() {
//        return userRepository.findAll();
//    }

    @GetMapping("/users")
    public User getTodos() {
        //return userRepository.findAll();
        User user = new User();
        user.setPassword("123456");
        user.setUserid(1000L);
        user.setUsername("admin");
        return user;
    }
}
