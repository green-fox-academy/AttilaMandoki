package com.greenfoxacademy.listing_todos_from_embedded_database.repository;

import com.greenfoxacademy.listing_todos_from_embedded_database.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
