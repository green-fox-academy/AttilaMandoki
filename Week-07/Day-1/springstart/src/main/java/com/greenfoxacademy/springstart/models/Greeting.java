package com.greenfoxacademy.springstart.models;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  AtomicLong id;
  String content;

  public Greeting() {
  }

  public Greeting(AtomicLong id, String content) {
    this.id = id;
    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public void setId(AtomicLong id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
