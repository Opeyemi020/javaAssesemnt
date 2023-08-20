package com.example.todolist.dtos.response;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddTaskResponse {
    private String message;
    private String task;
    private Long taskId;
}
