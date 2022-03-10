package com.example.AnimalLover;

public class ParrotLover implements IHuman{
  private String name;
  private Parrot pet;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Parrot getParrot() {
    return pet;
  }
  public void setParrot(Parrot parrot) {
    this.pet = parrot;
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
