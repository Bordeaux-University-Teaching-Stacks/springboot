package io.galaxee.mythicplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.galaxee.mythicplus")
public class MythicPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MythicPlusApplication.class, args);
	}

}
