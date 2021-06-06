package com.krobacorp.chatapp.controller;

import com.krobacorp.chatapp.model.Greeting;
import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.repository.UserRepository;
import com.krobacorp.chatapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
//    private UserRepository userRepository;
    private final UserService userService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/loadUsers")
    public List<User> loadUsers(@RequestParam("page") int page){
        return userService.loadUsers(page);
    };

    @PostMapping("/register")
    public User registerUser(@RequestBody() User user) {
        System.out.println("Got user: "+user.username);
        return userService.registerUser(user);
    };

    @PostMapping("/login")
    public User loginUser(@RequestBody() User user) {
        System.out.println("Got user: "+user.username);

        return userService.login(user);
    };

}