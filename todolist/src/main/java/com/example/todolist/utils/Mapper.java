package com.example.todolist.utils;

import com.example.todolist.data.models.Task;
import com.example.todolist.data.repositories.TaskRepository;
import com.example.todolist.dtos.request.AddTaskRequest;
import com.example.todolist.dtos.response.AddTaskResponse;

import static com.example.todolist.utils.AppUtils.TASK_ADDED_SUCCESSFULLY;

public class Mapper {
    static TaskRepository taskRepository;

    public static Task map(AddTaskRequest addTaskRequest){
        Task task = new Task();
        task.setTask(addTaskRequest.getTask());
        return task;
    }
    public static AddTaskResponse map(Task task){
        AddTaskResponse addTaskResponse = new AddTaskResponse();
        addTaskResponse.setMessage(TASK_ADDED_SUCCESSFULLY);

        return addTaskResponse;
    }
}

