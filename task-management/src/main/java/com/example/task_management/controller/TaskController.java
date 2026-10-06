package com.example.task_management.controller;

import com.example.task_management.domain.task.Task;
import com.example.task_management.domain.user.User;
import com.example.task_management.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task-control")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable String id) {
        return "Task com o id: " + id;
    }


    @PostMapping
    public String postTask(@RequestBody Task body) {
        return body.getTitle();

    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable String id) {
        return "Task com id " + id + " deletada com sucesso";
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable String id, @RequestBody Task body) {
        return "Usuário com id " + id + " atualizado" + body.getTitle();

    }




}
