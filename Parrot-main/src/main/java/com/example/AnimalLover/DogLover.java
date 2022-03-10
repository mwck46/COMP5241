package com.example.AnimalLover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogLover implements IHuman{
  private String name;

  @Autowired
  private Dog pet;

  //public DogLover(Dog pet) {
  //  this.pet = pet;
  //}
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Dog getDog() {
    return (Dog)pet;
  }
  public void setDog(Dog dog) {
    this.pet = dog;
  }
  @Override
  public String printName() {
    return String.format("I'm %s", getName()) ;
  }
  @Override
  public String printPetName() {
    return String.format("My pet is %s", pet.getName()) ;
  }
  @Override
  public void giveName(String name) {
    setName(name);
  }
  @Override
  public void givePetName(String name) {
    this.pet.setName(name);
  }
}
