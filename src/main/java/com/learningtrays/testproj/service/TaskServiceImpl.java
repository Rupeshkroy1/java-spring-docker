package com.learningtrays.testproj.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningtrays.testproj.models.Task;
import com.learningtrays.testproj.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    public TaskRepository taskRepo;

    @Override
    public Task getTaskById(int id) {
        // TODO Auto-generated method stub
        Optional<Task> data = taskRepo.findById(id);
        return data.get();
    }

    @Override
    public Task createTask(Task task) {
        return taskRepo.save(task);
    }

}
