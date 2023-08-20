package com.example.todolist.services;

import com.example.todolist.data.models.Task;
import com.example.todolist.data.repositories.TaskRepository;
import com.example.todolist.dtos.request.AddTaskRequest;
import com.example.todolist.dtos.response.AddTaskResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.todolist.utils.Mapper.map;

@Service
@AllArgsConstructor
public class TaskServiceImplementation implements TaskService {


    private TaskRepository taskRepository;

    @Override
    public AddTaskResponse addTask(AddTaskRequest addTaskRequest) {
        Task task = map(addTaskRequest);
        taskRepository.save(task);
        AddTaskResponse addTaskResponse = new AddTaskResponse();
        addTaskResponse.setMessage("Task added successfully");
        return map(task);
    }

    @Override
    public Long taskCount() {
        return taskRepository.count();
    }

    public List<Task> viewAllTask() {
        return taskRepository.findAll();

    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task findBy(Long taskId) {
        for (Task task : taskRepository.findAll()) {
            if (task.getId().equals(taskId)) return task;

        }
        return null;
    }
}
