package com.example.task_management.service;

import com.example.task_management.domain.user.User;
import com.example.task_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }


    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    public User updateUserById(String id, User user) {
        User user1 = getUserById(id);
        return userRepository.save(user1);
    }




}
