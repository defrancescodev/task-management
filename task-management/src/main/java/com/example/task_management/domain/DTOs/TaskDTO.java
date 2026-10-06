package com.example.task_management.domain.DTOs;

import com.example.task_management.domain.task.TaskStatus;

public class TaskDTO {
    private String id;
    private String title;
    private String description;
    private TaskStatus taskStatus;

    public TaskDTO() {

    }

    public TaskDTO(String id, String title, String description, TaskStatus taskStatus) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.taskStatus = taskStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
