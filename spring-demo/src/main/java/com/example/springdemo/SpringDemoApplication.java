package com.example.springdemo;

import com.example.springdemo.component.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringDemoApplication {

	@Autowired
	private final Person person;

	public SpringDemoApplication(Person person) {
		this.person = person;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void inRun(){
		person.goTaxi();
	}

}
