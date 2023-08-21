package com.example.todolist.controller;

import com.example.todolist.dtos.request.AddTaskRequest;
import com.example.todolist.dtos.response.AddTaskResponse;
import com.example.todolist.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sultanTask/")
public class TaskController {
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/addTask/")
    public ResponseEntity<AddTaskResponse> addTask(@RequestBody AddTaskRequest request){
        AddTaskResponse response = taskService.addTask(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/delete/Task/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
    taskService.deleteTask(id);
    return ResponseEntity.ok("task successfully deleted");
    }

}
