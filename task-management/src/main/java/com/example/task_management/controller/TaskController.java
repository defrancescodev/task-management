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
    public Task getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }


    @PostMapping
    public Task postTask(@RequestBody Task body) {
        return taskService.createTask(body);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTaskByd(id);
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable String id, @RequestBody Task body) {
        return "Usuário com id " + id + " atualizado" + body.getTitle();

    }




}
