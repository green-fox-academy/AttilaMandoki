package com.greenfoxacademy.listing_todos_from_embedded_database;

import com.greenfoxacademy.listing_todos_from_embedded_database.model.Todo;
import com.greenfoxacademy.listing_todos_from_embedded_database.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosFromEmbeddedDatabaseApplication implements CommandLineRunner {

	@Autowired
	TodoRepository myTodo;

	public static void main(String[] args) {
		SpringApplication.run(ListingTodosFromEmbeddedDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myTodo.save(new Todo("Pack lunch"));
		myTodo.save(new Todo("Grab charger"));
		myTodo.save(new Todo("Buy snacks"));
	}
}
