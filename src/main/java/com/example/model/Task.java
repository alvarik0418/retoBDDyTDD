package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Task {
    public static final boolean DEFAULT_COMPLETED = false;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título de la tarea no puede estar vacío")
    private String title;

    @NotBlank(message = "La descripción de la tarea no puede estar vacío")
    private String description;

    private Boolean completed = DEFAULT_COMPLETED;

    public Task() {
    }

    public Task(Long id, String title, String description, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed == null ? DEFAULT_COMPLETED : completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Boolean getCompleted() {
        return completed ;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed == null ? DEFAULT_COMPLETED : completed;
    }
}
