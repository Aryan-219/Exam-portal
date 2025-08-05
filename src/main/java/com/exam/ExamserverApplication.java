package com.exam;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication  // this includes @ComponentScan, @Configuration, and @EnableAutoConfiguration
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

		User user = new User();
		user.setUserName("aarushi123");
		user.setFirstName("Aarushi");
		user.setLastName("Garg");
		user.setEmail("abc@gmail.com");
		user.setPassword("abc");
		user.setPhone("1234567890");
		user.setProfile("default.png");
		user.setEnabled(true);


		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);

		userRoleSet.add(userRole);

		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUserName());





	}
}
