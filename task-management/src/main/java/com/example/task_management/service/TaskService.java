package com.example.task_management.service;


import com.example.task_management.domain.task.Task;
import com.example.task_management.domain.user.User;
import com.example.task_management.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTaskById(String id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public void deleteTaskByd(String id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(String id, Task task) {
        Task task1 = getTaskById(id);
        return taskRepository.save(task1);
    }
}
