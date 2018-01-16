package org.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MS07Application {

	public static void main(String[] args) {
		SpringApplication.run(MS07Application.class, args);
	}
}
