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
    public String getTaskById(@PathVariable String id) {
        return "Tarefa com ID: " + id;
    }

    @GetMapping()
    public String helloUser() {
        return this.userService.helloUser("Samuel");
    }

    @PostMapping()
    public String postUser(@RequestBody User body) {
        return body.getEmail();

    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        return "Usuário com id " + id + " deletado com sucesso";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable String id,@RequestBody User body) {
        return "Usuário com id " + id + " atualizado" + body.getEmail();
    }

}
