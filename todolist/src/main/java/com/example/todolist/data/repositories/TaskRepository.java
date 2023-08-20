package com.example.todolist.data.repositories;

import com.example.todolist.data.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long>{

}
