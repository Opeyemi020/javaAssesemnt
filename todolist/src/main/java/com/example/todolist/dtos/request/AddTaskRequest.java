package com.example.todolist.dtos.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddTaskRequest {
    private String task;
}
