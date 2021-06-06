package com.krobacorp.chatapp.service;


import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User registerUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }

    public List<User> loadUsers(int page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.by("createdAt").descending());
            Page<User> usersPage = userRepository.findAll(pageable);
            return usersPage.getContent();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }

    public List<User> getAllUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }

    public User login(User user) {
        try {
            System.out.println("Fireing login for: "+ user.username+ user.password);
            User gotUser = userRepository.getFirstByUsernameAndPassword(user.username, user.password);
            if (gotUser == null) {
                return null;
            }
            System.out.println("Got user: "+ gotUser.username);
            return gotUser;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
            return null;
        }
    }

}
