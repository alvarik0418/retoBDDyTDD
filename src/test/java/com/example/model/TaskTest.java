package com.example.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TaskTest {

    @Test
    void TaskShouldBeInstantiated() {
        Task task = new Task();

        assertThat(task).isNotNull();

        task.setId(1L);
        task.setTitle("Test Task Title");
        task.setDescription("Test Task Description");
        task.setCompleted(null);

        assertThat(task.getId()).isNotNull().isEqualTo(1L);
        assertThat(task.getTitle()).isNotNull().isEqualTo("Test Task Title");
        assertThat(task.getDescription()).isNotNull().isEqualTo("Test Task Description");
        assertThat(task.getCompleted()).isFalse();
    }

}
