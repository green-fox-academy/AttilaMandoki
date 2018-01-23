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

  public List<Assignee> findAll() {
    return (List<Assignee>) assigneeRepository.findAll();
  }

  @Override
  public void addAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void addEmail(Assignee email) {
    assigneeRepository.save(email);
  }

  @Override
  public void deleteAssignee(int assignee_id) {
    assigneeRepository.delete(assignee_id);
  }

  @Override
  public void editAssignee(Assignee assignee) {

  }
}
