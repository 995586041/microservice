package org.gh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/{age}")
	public User findById(@PathVariable Integer age) {
		User one = new User("zs", age);
		return one;
	}
}
