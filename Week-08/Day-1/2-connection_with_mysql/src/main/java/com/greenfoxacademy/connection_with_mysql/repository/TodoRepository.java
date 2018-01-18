package com.greenfoxacademy.connection_with_mysql.repository;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
  List<Todo> findAllByTitleContains(String title);
}
