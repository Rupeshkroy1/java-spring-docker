package com.learningtrays.testproj.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.learningtrays.testproj.models.Task;

@Service
public interface TaskService {

    public Task getTaskById(int id);

    public Task createTask(Task task);

}
