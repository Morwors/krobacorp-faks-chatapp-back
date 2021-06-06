package com.krobacorp.chatapp.config;

import com.krobacorp.chatapp.model.User;
import com.krobacorp.chatapp.repository.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.krobacorp.chatapp.repository")
@Configuration
public class MongoDBConfig {

}
