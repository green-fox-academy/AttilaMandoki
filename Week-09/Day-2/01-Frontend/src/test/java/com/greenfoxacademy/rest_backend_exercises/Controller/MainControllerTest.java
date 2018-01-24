package com.greenfoxacademy.rest_backend_exercises.Controller;

import com.greenfoxacademy.rest_backend_exercises.RestBackendExercisesApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestBackendExercisesApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MainControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoubling() throws Exception {
    mockMvc.perform(
            get("/doubling?input=15")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.received", is(15)))
            .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void testGreeter() throws Exception {
    mockMvc.perform(
            get("/greeter?name=John&title=teacher"))
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.welcome_message"
                    , is("Oh, hi there John, my dear teacher!")));
  }
}