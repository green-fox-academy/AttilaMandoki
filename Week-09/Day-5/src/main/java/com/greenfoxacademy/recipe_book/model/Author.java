package com.greenfoxacademy.recipe_book.model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String wroteBy;
  private String dateInString;

  @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "id")
  private List<Recipe> recipes;

  public Author() {
  }

  public Author(String wroteBy, String dateInString) {
    this.wroteBy = wroteBy;
    this.dateInString = dateInString;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getWroteBy() {
    return wroteBy;
  }

  public void setWroteBy(String wroteBy) {
    this.wroteBy = wroteBy;
  }

  public String getDateInString() {
    return dateInString;
  }

  public void setDateInString(String dateInString) {
    this.dateInString = dateInString;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
    try {
      Date date = formatter.parse(dateInString);
      System.out.println(date);
      System.out.println(formatter.format(date));
    } catch (ParseException e) {
      //handle exception if dateInString is not in "dd-mm-yyyy" format
    }
  }
}
