package com.greenfoxacademy.connection_with_mysql.controller;

import com.greenfoxacademy.connection_with_mysql.Service.TodoService;
import com.greenfoxacademy.connection_with_mysql.Service.TodoServiceImpl;
import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoService todoService;
  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    model.addAttribute("todoList", todos);
    return "todo";
  }

  @GetMapping({"/isactive"})
  public String isActive(Model model) {
    List<Todo> stillActive = new ArrayList<>();
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    for (Todo todo : todos) {
      if (todo.getIsDone() == false) {
        stillActive.add(todo);
      }
    }
    model.addAttribute("todoList", stillActive);
    return "todo";
  }

  @GetMapping("/add")
  public String addTask(@ModelAttribute Todo todo) {
    todoService.addTask(todo);
    return "add";
  }

  @PostMapping("/todo/submit")
  public String submitNewTodo(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/list";
  }
}
