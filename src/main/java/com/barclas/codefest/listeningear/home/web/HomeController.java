package com.barclas.codefest.listeningear.home.web;

import com.barclas.codefest.listeningear.home.model.User;
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

    @GetMapping("/users")
    public Iterable<User> getTodos() {
        return userRepository.findAll();
    }

    @PostMapping("/login")
    public String login(@RequestBody Long userId, @RequestBody String password) {
         User user = userRepository.findByUseridAndPassword(userId, password);
         if(user != null){
             return "login success";
         }
         return "Unsuccessful login attempt!";
    }

}
