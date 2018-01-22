package com.greenfoxacademy.connection_with_mysql.repository;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Integer> {
  List<Assignee> findAllByIdContains(Integer id);
  List<Assignee> findAllByEmailContains(String email);
  List<Assignee> findAll(String id, String email);
}
