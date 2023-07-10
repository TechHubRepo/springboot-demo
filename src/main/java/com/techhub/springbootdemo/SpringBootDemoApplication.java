package com.techhub.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.techhub.springbootdemo.controller.UserController;

/**
 * The SpringBootDemoApplication
 * 
 * @author ramniwash
 */
@SpringBootApplication
@PropertySource("classpath:message.properties")
public class SpringBootDemoApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * The Starting point of the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserController userController = applicationContext.getBean(UserController.class);
		
//		userController.saveUsers();
		
//		userController.getUserByCountry("INDIA");
//		userController.getUserByCountry("RUSSIA");
		
//		userController.getUserByCity("Bangalore");
//		userController.getUserByCity("Moscow");
		
//		userController.getUserByCountryAndCity("INDIA", "Gurugram");
//		userController.getUserByCountryOrCity("RUSSIA", "Gurugram");
		
//		userController.getUsersByMobileNumberOrEmail("9652412329");
//		userController.getUsersByMobileNumberOrEmail("ram@gmail.com");
		
//		userController.updateUserEmailId("U0001", "ram123@gmail.com");
		
//		userController.getAllUsers(1,4);
		
//		userController.getUsernameStatePincode();
	}
}
