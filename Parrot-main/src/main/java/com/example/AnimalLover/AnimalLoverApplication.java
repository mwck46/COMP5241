/* Point of interest

1. Dependency Inversion
Defined IHuman & IPet interface that can be used by printPersion()

2. Dependency Injection
Method 1: @Configuration, @Bean
Person, Parrot -> Create java bean (instance of class managed by spring framework) in a ProjectConfiguration class with @Configuration 

Method 2: @Component, @Autowired
DogLover, Dog -> Add @Component to DogLover & Dog and add @Autowired to the dog attribute of DogLover

Method 3: Constructor
*/

package com.example.AnimalLover;

//import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalLoverApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(AnimalLoverApplication.class, args);

		// Method 1
		ParrotLover p = context.getBean(ParrotLover.class);
		printPersion(p);

		// Method 2
		DogLover dl = context.getBean(DogLover.class);
		dl.giveName("Daniel");
		dl.givePetName("D Dog");
		printPersion(dl);

	}

	public static void printPersion(IHuman p)
	{
		System.out.println(p.printName());
		System.out.println(p.printPetName());
	}
}
