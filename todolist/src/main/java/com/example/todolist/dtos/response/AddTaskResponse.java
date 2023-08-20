package com.example.todolist.dtos.response;

import lombok.Data;

@Data
public class AddTaskResponse {
    private String message;
    private String task;
    private Long taskId;
}
