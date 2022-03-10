package com.example.AnimalLover;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
  @Bean
  public Parrot parrot1() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }
 
  @Bean
  public Parrot parrot2() {
    Parrot p = new Parrot();
    p.setName("Miki");
    return p;
  }

  // Because there are >1 Parrot type beans, use Qualifier to specify which one
  @Bean
  public ParrotLover person(@Qualifier("parrot1") Parrot parrot) {    
    ParrotLover p = new ParrotLover();
    p.setName("Peter");
    p.setParrot(parrot);
    return p;
  }
  
}
