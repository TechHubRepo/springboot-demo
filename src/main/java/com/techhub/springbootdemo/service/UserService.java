package com.techhub.springbootdemo.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.techhub.springbootdemo.dto.UserDTO;

/**
 * The UserService
 * 
 * @author ramniwash
 */
public interface UserService {

	public String registerUser(UserDTO userDTO);

	public String registerUsers(List<UserDTO> users);

	public String deleteAll();

	public List<UserDTO> getUserDTOsByCountry(String country);

	public List<UserDTO> getUserDTOsByCity(String city);

	public List<UserDTO> getUserDTOsByCountryAndCity(String country, String city);

	public List<UserDTO> getUserDTOsByCountryOrCity(String country, String city);

	public List<UserDTO> getUserDTOsByMobileNumberOrEmailId(String mobileNumberOrEmailId);
	
	public int updateEmailId(String userId, String emailId);
	
	public  List<UserDTO>  getAllUserDTOs(PageRequest pageRequest);
	
	public  List<Object[]>  getUsernameStatePincode();
}
