package com.techhub.springbootdemo.util;

import java.util.List;
import java.util.logging.Logger;

import com.techhub.springbootdemo.dto.UserDTO;
import com.techhub.springbootdemo.model.User;

/**
 * The UserPrintUtil
 * 
 * @author ramniwash
 */
public final class UserPrintUtil {

	/** The LOGGER */
	private static final Logger LOGGER = Logger.getLogger(UserPrintUtil.class.getSimpleName());

	/** Private Constructor */
	private UserPrintUtil() {
	}

	/**
	 * Return the String format of UserDTO
	 * 
	 * @param userDTO UserDTO
	 * @return StringBuilder
	 */
	public static final StringBuilder getUserString(UserDTO userDTO) {
		StringBuilder sb = new StringBuilder();
		sb.append(" | ").append(userDTO.getUserid()).append(" | ").append(userDTO.getUsername()).append(" | ")
				.append(userDTO.getPassword()).append(" | ").append(userDTO.getMobileNumber()).append(" | ")
				.append(userDTO.getEmailId()).append(" | ").append(userDTO.getCity()).append(" | ")
				.append(userDTO.getCountry()).append(" | ");
		return sb;
	}

	/**
	 * Print the UserDTO
	 * 
	 * @param userDTO
	 */
	public static final void printUser(UserDTO userDTO) {
		LOGGER.info(getUserString(userDTO).toString());
	}

	/**
	 * Return the String format of User
	 * 
	 * @param user User reference
	 * @return StringBuilder
	 */
	public static final StringBuilder getUserString(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append(" | ").append(user.getUserid()).append(" | ").append(user.getUsername()).append(" | ")
				.append(user.getPassword()).append(" | ").append(user.getMobileNumber()).append(" | ")
				.append(user.getEmailId()).append(" | ").append(user.getCity()).append(" | ").append(user.getCountry())
				.append(" | ");
		return sb;
	}

	/**
	 * Print the UserDTO
	 * 
	 * @param userDTO
	 */
	public static final void printUser(User user) {
		LOGGER.info(getUserString(user).toString());
	}

	/**
	 * Print the UserDTOs
	 * 
	 * @param userDTOs
	 */
	public static final void printUserDtos(List<UserDTO> userDTOs) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (UserDTO userDTO : userDTOs) {
			sb.append(getUserString(userDTO).append("\n"));
		}
		LOGGER.info(sb.toString());
	}

	/**
	 * Print the UserDTOs
	 * 
	 * @param userDTOs
	 */
	public static final void printUser(List<User> users) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (User user : users) {
			sb.append(getUserString(user).append("\n"));
		}
		LOGGER.info(sb.toString());
	}

	/**
	 * Print the List of Object array
	 * 
	 * @param objectsList List of Object array
	 */
	public static final void printObjectArrayList(List<Object[]> objectsList) {
		StringBuilder sb = new StringBuilder();
		for (Object[] objects : objectsList) {
			sb.append("\n");
			for (Object object : objects) {
				sb.append(" | ").append(object);
			}
			sb.append(" | ");
		}
		sb.append("\n");
		LOGGER.info(sb.toString());
	}
}
