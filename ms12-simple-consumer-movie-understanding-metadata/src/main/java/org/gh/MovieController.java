package org.gh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:9011/"+id, User.class);
	}
	
	@GetMapping("/show-info")
	public List<ServiceInstance> showInfo(){
		return this.discoveryClient.getInstances("MS11-SIMPLE-PROVIDER-USER-MY-METADATA");
	}
}
