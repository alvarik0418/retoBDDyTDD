package com.example.service;

import com.example.model.Task;
import com.example.repository.ITaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TaskServiceTest {
    private ITaskRepository taskRepository;

    private TaskService taskService;

    @BeforeEach
    void setUp(){
        taskRepository = Mockito.mock(ITaskRepository.class);
        taskService = new TaskService(taskRepository);
    }

    @Test
    void createTask_shouldSaveAndReturnTask(){
        Task newTask = new Task();
        newTask.setTitle("New Task");
        newTask.setDescription("New Description");

        Task savedTask = new Task(3L, newTask.getTitle(), newTask.getDescription(),null);

        when(taskRepository.save(any(Task.class))).thenReturn(savedTask);

        Task createdTask = taskService.createTask(newTask);

        assertThat(createdTask).isNotNull();
        assertThat(createdTask.getId()).isEqualTo(savedTask.getId());
        assertThat(createdTask.getTitle()).isEqualTo(savedTask.getTitle());
        assertThat(createdTask.getDescription()).isEqualTo(savedTask.getDescription());
        assertThat(createdTask.getCompleted()).isFalse();

        verify(taskRepository, times(1)).save(any(Task.class));
    }
}
