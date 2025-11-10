package com.java.springboot.TodoApp.repository;


import com.java.springboot.TodoApp.models.Todo;
import com.java.springboot.TodoApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
