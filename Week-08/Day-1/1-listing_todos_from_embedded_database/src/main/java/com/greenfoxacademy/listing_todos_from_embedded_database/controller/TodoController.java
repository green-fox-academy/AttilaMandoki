package com.greenfoxacademy.listing_todos_from_embedded_database.controller;

import com.greenfoxacademy.listing_todos_from_embedded_database.model.Todo;
import com.greenfoxacademy.listing_todos_from_embedded_database.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    model.addAttribute("todoList", todos);
    return "todo";
  }
}
