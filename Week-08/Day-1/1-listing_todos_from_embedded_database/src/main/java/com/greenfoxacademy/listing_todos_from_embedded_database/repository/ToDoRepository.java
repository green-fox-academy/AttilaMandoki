package com.greenfoxacademy.listing_todos_from_embedded_database.repository;

import com.greenfoxacademy.listing_todos_from_embedded_database.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Integer> {
}
