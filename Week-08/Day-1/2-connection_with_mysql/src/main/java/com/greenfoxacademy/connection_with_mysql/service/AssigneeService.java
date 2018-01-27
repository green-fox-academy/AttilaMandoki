package com.greenfoxacademy.connection_with_mysql.service;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {

  void addAssignee(Assignee assignee);

  void addEmail(Assignee email);

  void deleteAssignee(int id);

  void editAssignee(Assignee assignee);

  List<Assignee> findAll();

}
