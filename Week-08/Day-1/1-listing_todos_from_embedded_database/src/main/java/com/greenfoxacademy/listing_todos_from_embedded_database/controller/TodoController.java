package com.greenfoxacademy.listing_todos_from_embedded_database.controller;

import com.greenfoxacademy.listing_todos_from_embedded_database.model.ToDo;
import com.greenfoxacademy.listing_todos_from_embedded_database.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    return "This is my first todo";
  }
}
