package org.gh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MS11Application {

	public static void main(String[] args) {
		SpringApplication.run(MS11Application.class, args);
	}
}
