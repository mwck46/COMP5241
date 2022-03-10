package com.example.AnimalLover;

import org.springframework.stereotype.Component;

@Component
public class Dog implements IPet{
 
  private String name;
 
  public String getName() {
    return name;
  }
 
  public void setName(String name) {
    this.name = name;
  }
}
