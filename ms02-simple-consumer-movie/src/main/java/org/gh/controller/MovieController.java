package org.gh.controller;

import org.gh.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:9000/"+id, User.class);
	}
}
