package com.greenfoxacademy.connection_with_mysql.service;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> getAllTodo() {
    return (List<Todo>) todoRepository.findAll();
  }

  @Override
  public Todo getTodoById(int id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void addTask(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTask(int id) {
    todoRepository.delete(id);
  }

  @Override
  public void editTask(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> taskSearch(String title) {
    return todoRepository.findAllByTitleContains(title);
  }

}
