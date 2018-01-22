package com.greenfoxacademy.connection_with_mysql.service;

import com.greenfoxacademy.connection_with_mysql.model.Assignee;
import com.greenfoxacademy.connection_with_mysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Override
  public List<Assignee> getAllTodo() {
    return (List<Assignee>) AssigneeRepository.findAll();
  }

  @Override
  public void addAssignee(Assignee assignee) {
    AssigneeRepository.save(assignee);
  }

  @Override
  public void addEmail(Assignee email) {
    AssigneeRepository.save(email);
  }

  @Override
  public void deleteAssignee(int id) {
    AssigneeRepository.delete(id);
  }

  @Override
  public void editAssignee(Assignee assignee) {

  }
}
