package com.greenfoxacademy.using_dependencies.configurations;

import com.greenfoxacademy.using_dependencies.models.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld helloWorld() {
    return new HelloWorld();
  }
}
