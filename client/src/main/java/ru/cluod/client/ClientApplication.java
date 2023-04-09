package ru.cluod.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);

		System.out.println("Application started!");
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		System.out.println("After startup event!");
	}
}
