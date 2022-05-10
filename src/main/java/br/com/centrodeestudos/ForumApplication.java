package br.com.centrodeestudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumApplication {

	public static void main(String[] args) {
		System.out.println(System.getProperty("catalina.base"));
		SpringApplication.run(ForumApplication.class, args);
	}

}
