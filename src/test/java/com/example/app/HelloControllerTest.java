package com.example.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.app.controller.HelloController;

public class HelloControllerTest {
  private HelloController controller;
  @Before
  public void setUp(){
    controller = new HelloController();
  }

  @Test
  public void greetingTest(){
    String result = controller.hello();
    assertEquals(result, "ok");
  }
  
}
