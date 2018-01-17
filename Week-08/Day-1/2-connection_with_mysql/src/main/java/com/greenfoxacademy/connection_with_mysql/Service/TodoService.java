package com.greenfoxacademy.connection_with_mysql.Service;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> getAllTodo();

  Todo getTodoById(int id);

  void addTask(Todo todo);

  void deleteTask(int id);

  void editTask(Todo todo);
}
