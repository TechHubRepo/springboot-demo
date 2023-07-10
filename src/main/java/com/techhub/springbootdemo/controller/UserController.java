package com.techhub.springbootdemo.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.techhub.springbootdemo.constants.Objects;
import com.techhub.springbootdemo.dto.UserDTO;
import com.techhub.springbootdemo.service.UserService;
import com.techhub.springbootdemo.util.UserPrintUtil;

/**
 * The UserController
 * 
 * @author ramniwash
 */
@Component
@PropertySource("classpath:message.properties")
public class UserController {

	/** The LOGGER */
	private static final Logger LOGGER = Logger.getLogger(UserPrintUtil.class.getSimpleName());

	@Autowired
	private Environment environment;

	@Autowired
	private UserService userService;

	public void saveUsers() {
		String message = userService.registerUsers(Objects.getUsersDTOs());
		LOGGER.info(message);
	}

	public void deleteAllUsers() {
		String message = userService.deleteAll();
		LOGGER.info(message);
		LOGGER.info(environment.getProperty(message));
	}

	public void getUserByCountry(String country) {
		List<UserDTO> userDtos = userService.getUserDTOsByCountry(country);
		UserPrintUtil.printUserDtos(userDtos);
	}

	public void getUserByCity(String city) {
		List<UserDTO> userDtos = userService.getUserDTOsByCity(city);
		UserPrintUtil.printUserDtos(userDtos);
	}

	public void getUserByCountryAndCity(String country, String city) {
		List<UserDTO> userDtos = userService.getUserDTOsByCountryAndCity(country, city);
		UserPrintUtil.printUserDtos(userDtos);
	}

	public void getUserByCountryOrCity(String country, String city) {
		List<UserDTO> userDtos = userService.getUserDTOsByCountryOrCity(country, city);
		UserPrintUtil.printUserDtos(userDtos);
	}

	public void getUsersByMobileNumberOrEmail(String mobileNumberOrEmailId) {
		List<UserDTO> userDtos = userService.getUserDTOsByMobileNumberOrEmailId(mobileNumberOrEmailId);
		UserPrintUtil.printUserDtos(userDtos);
	}

	public void updateUserEmailId(String userId, String emailId) {
		int recordUpdated = userService.updateEmailId(userId, emailId);
		LOGGER.info("Record Updatred :  " + recordUpdated);
	}
	
	public void getAllUsers(int offset, int limit) {
		PageRequest pageRequest=	PageRequest.of(offset, limit);
		List<UserDTO> userDtos  = userService.getAllUserDTOs(pageRequest);
		UserPrintUtil.printUserDtos(userDtos);
	}
	
	public void getUsernameStatePincode() {
		List<Object[]> objectArrayList  = userService.getUsernameStatePincode();
		UserPrintUtil.printObjectArrayList(objectArrayList);
	}
}
