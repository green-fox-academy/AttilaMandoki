package com.greenfoxacademy.connection_with_mysql;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository myTodo;

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myTodo.save(new Todo("Pack lunch"));
    myTodo.save(new Todo("Grab charger"));
    myTodo.save(new Todo("Buy snacks"));
  }
}
