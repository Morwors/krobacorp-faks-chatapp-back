package com.krobacorp.chatapp.repository;

import com.krobacorp.chatapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Pageable;
import java.util.List;


public interface UserRepository extends MongoRepository<User, String> {
    public User getFirstByUsername(String username);

    public User getFirstByUsernameAndPassword(String username, String password);

//    public User getFirstByUsername(String us)
//    public List<User> findAll();
}
