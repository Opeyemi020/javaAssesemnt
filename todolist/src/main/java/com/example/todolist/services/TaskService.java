package com.example.todolist.services;

import com.example.todolist.data.models.Task;
import com.example.todolist.dtos.request.AddTaskRequest;
import com.example.todolist.dtos.response.AddTaskResponse;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TaskService {
    AddTaskResponse addTask(AddTaskRequest addTaskRequest);

    Long taskCount();

    List<Task> viewAllTask();

    void deleteTask(Long id);

    Task findBy(Long taskId);
}
