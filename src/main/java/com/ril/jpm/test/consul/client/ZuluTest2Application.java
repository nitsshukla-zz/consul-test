package com.ril.jpm.test.consul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ZuluTest2Application {

	@RequestMapping("/")
    public String health() {
		System.out.println("health");
		return "ok";
	}
	@RequestMapping("/ok-api")
    public ResponseEntity<String> home() {
		System.out.println("Request came");
		int random = (int)(Math.random()*100);
		System.out.println(random);
		if (random<50)
			return ResponseEntity.badRequest().build();
		return ResponseEntity.ok().body("Hello world");
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ZuluTest2Application.class, args);
	}

}
