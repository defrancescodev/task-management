package com.example.task_management.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String helloUser(String name) {
        return "Hello " + name;
    }
}
