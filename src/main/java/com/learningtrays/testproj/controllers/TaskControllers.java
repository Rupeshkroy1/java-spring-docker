package com.learningtrays.testproj.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningtrays.testproj.models.Task;
import com.learningtrays.testproj.service.TaskServiceImpl;

@RestController
public class TaskControllers {

    @Autowired
    public TaskServiceImpl taskService;

    @GetMapping("/task")
    public Task GetTaskById(@RequestParam int taskId) {
        return taskService.getTaskById(taskId);
    }

    @PostMapping("/createTask")
    public Task CreateTask(@RequestBody Task object) {
        return taskService.createTask(object);
    }

}
