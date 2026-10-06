package com.example.task_management.service;


import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public String getTask(String task) {
        return "Task name: " + task;
    }
}
