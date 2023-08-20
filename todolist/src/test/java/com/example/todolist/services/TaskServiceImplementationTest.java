package com.example.todolist.services;

import com.example.todolist.dtos.request.AddTaskRequest;
import com.example.todolist.dtos.response.AddTaskResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.BDDMockito.given;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceImplementationTest {
    @Autowired
    private TaskService taskService;

    @Test
    void testThatWhenTaskIsCreated_TaskExistTest(){
        AddTaskRequest addTaskRequest = new AddTaskRequest();
        AddTaskResponse addTaskResponse = new AddTaskResponse();
        addTaskRequest.setTask("i need to get some foodstuff");
        assertNotNull(addTaskResponse);

    }
    @Test
    void testThatTaskCanBeAdded(){
        AddTaskRequest request = new AddTaskRequest();
        assertEquals(taskService.taskCount(),0);
        taskService.addTask(request);
    }
    @Test
    void canViewAllTaskTest(){
        AddTaskRequest request = new AddTaskRequest();
        AddTaskRequest request1 = new AddTaskRequest();
        taskService.addTask(request);
        taskService.addTask(request1);
        assertEquals(taskService.viewAllTask().size(),2);

    }
    @Test
    void canDeleteTaskTest() {
        AddTaskRequest request = new AddTaskRequest();
        AddTaskRequest request1 = new AddTaskRequest();
        AddTaskRequest request2 = new AddTaskRequest();
        var response = taskService.addTask(request);
        taskService.addTask(request1);
        taskService.addTask(request2);
        taskService.deleteTask(response.getTaskId());
        var foundTask = taskService.findBy(response.getTaskId());
        assertNull(foundTask);
        assertEquals(taskService.viewAllTask().size(), 2);
    }
}