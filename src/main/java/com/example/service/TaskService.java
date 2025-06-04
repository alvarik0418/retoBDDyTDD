package com.example.service;

import com.example.model.Task;
import com.example.repository.ITaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    final ITaskRepository taskRepository;

    public TaskService(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task taskNew) {
        return taskRepository.save(taskNew);
    }
}
