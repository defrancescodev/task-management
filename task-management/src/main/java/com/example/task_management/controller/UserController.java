package com.example.task_management.controller;

import com.example.task_management.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.task_management.service.UserService;

@RequestMapping("/control")
@RestController
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return this.userService.getUserById(id);
    }


    @PostMapping()
    public User postUser(@RequestBody User body) {
        return this.userService.createUser(body);

    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id) {
        this.userService.deleteUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id,@RequestBody User body) {
        return this.userService.updateUserById(id, body);
    }

}
