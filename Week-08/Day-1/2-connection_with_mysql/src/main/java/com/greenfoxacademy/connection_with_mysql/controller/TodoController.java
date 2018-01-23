package com.greenfoxacademy.connection_with_mysql.controller;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import com.greenfoxacademy.connection_with_mysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
      if (!todo.isDone()) {
        stillActive.add(todo);
      }
    }
    model.addAttribute("todoList", stillActive);
    return "todo";
  }

  @GetMapping("/add")
  public String addTask(@ModelAttribute Todo todo) {
    return "add";
  }

  @PostMapping("/add")
  public String submitNewTodo(@ModelAttribute Todo todo) {
    todoService.addTask(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/update/{id}")
  public String editTask(@PathVariable Integer id, Model model) {
    Todo todo = todoService.getTodoById(id);
    model.addAttribute("todos", todo);
    return "/update";
  }

  @PostMapping("/update/{id}")
  public String editingSite(@PathVariable Integer id, @ModelAttribute Todo todo) {
    todo.setId(id);
    todoService.editTask(todo);
    return "redirect:/todo/list";
  }

  @PostMapping("/delete/{id}")
  public ModelAndView delete(@PathVariable Integer id) {
    todoService.deleteTask(id);
    return new ModelAndView("redirect:/todo/list");
  }

  @GetMapping("/search")
  public String search(@RequestParam(value = "search", required = false) String search, Model model) {
    List<Todo> findAllByTitleContains = todoService.taskSearch(search);
    model.addAttribute("todoList", findAllByTitleContains);
    return "todo";
  }
}
