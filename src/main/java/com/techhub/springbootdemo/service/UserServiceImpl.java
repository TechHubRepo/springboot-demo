package com.techhub.springbootdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.techhub.springbootdemo.adpator.UserAdaptor;
import com.techhub.springbootdemo.constants.MessageKey;
import com.techhub.springbootdemo.dto.UserDTO;
import com.techhub.springbootdemo.model.User;
import com.techhub.springbootdemo.repository.UserRepository;

/**
 * The UserService
 * 
 * @author ramniwash
 */
@Service
public class UserServiceImpl implements UserService {

	/** The logger */
	private Logger logger = Logger.getLogger(UserServiceImpl.class.getSimpleName());

	@Autowired
	private UserRepository userRepository;

	/**
	 * Register new User
	 * 
	 * @param userDTO UserDTO reference
	 * @return String the message
	 */
	public String registerUser(UserDTO userDTO) {
		User user = UserAdaptor.toUser(userDTO);
		logger.info(user.toString());
		user = this.userRepository.save(user);
		return MessageKey.REGISTRATION_SUCCESS;
	}

	@Override
	public String registerUsers(List<UserDTO> users) {
		this.userRepository.saveAll(UserAdaptor.toUser(users));
		return MessageKey.REGISTRATION_SUCCESS;
	}

	@Override
	public String deleteAll() {
		this.userRepository.deleteAll();
		return "All User Deleted";
	}

	@Override
	public List<UserDTO> getUserDTOsByCountry(String country) {
		return UserAdaptor.toUserDTO(this.userRepository.findByCountry(country));
	}

	@Override
	public List<UserDTO> getUserDTOsByCity(String city) {
		return UserAdaptor.toUserDTO(this.userRepository.findByCity(city));
	}

	@Override
	public List<UserDTO> getUserDTOsByCountryAndCity(String country, String city) {
		return UserAdaptor.toUserDTO(this.userRepository.findByCountryAndCity(country, city));
	}

	@Override
	public List<UserDTO> getUserDTOsByCountryOrCity(String country, String city) {
		return UserAdaptor.toUserDTO(this.userRepository.findByCountryOrCity(country, city));
	}

	@Override
	public List<UserDTO> getUserDTOsByMobileNumberOrEmailId(String mobileNumberOrEmailId) {
		return UserAdaptor.toUserDTO(this.userRepository.findByMobileNumberOrEmailId(mobileNumberOrEmailId));
	}

	@Override
	public int updateEmailId(String userId, String emailId) {
		return this.userRepository.updateEmailId(userId,emailId);
	}

	@Override
	public List<UserDTO> getAllUserDTOs(PageRequest pageRequest) {
		return UserAdaptor.toUserDTO(this.userRepository.getAll(pageRequest));
	}

	@Override
	public List<Object[]> getUsernameStatePincode() {
		return this.userRepository.getUserNameStatePinCode();
	}
}
