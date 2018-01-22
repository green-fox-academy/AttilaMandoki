package com.greenfoxacademy.connection_with_mysql.service;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import com.greenfoxacademy.connection_with_mysql.model.Todo;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeService {

  void addAssignee(Assignee assignee);

  void addEmail(Assignee email);

  void deleteAssignee(int id);

  void editAssignee(Assignee assignee);

}
