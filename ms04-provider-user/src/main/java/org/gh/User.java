package org.gh;

import lombok.Data;

@Data
public class User {
	
	private String name;
	private int age;

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
