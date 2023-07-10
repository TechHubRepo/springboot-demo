package com.techhub.springbootdemo.adpator;

import java.util.ArrayList;
import java.util.List;

import com.techhub.springbootdemo.dto.AddressDTO;
import com.techhub.springbootdemo.dto.UserDTO;
import com.techhub.springbootdemo.model.Address;
import com.techhub.springbootdemo.model.User;

/**
 * The UserAdaptor
 * 
 * @author ramniwash
 *
 */
public final class UserAdaptor {

	/** The private constructor */
	private UserAdaptor() {
	}

	/**
	 * Transfer the data from UserDTO to User object.
	 * 
	 * @param userDTO UserDTO reference
	 * @return User reference
	 */
	public static final User toUser(UserDTO userDTO) {
		User user = new User();
		user.setUserid(userDTO.getUserid());
		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		user.setMobileNumber(userDTO.getMobileNumber());
		user.setEmailId(userDTO.getEmailId());
		user.setCountry(userDTO.getCountry());
		user.setCity(userDTO.getCity());
		user.setAddresses(toAddresses(userDTO.getAddresses()));
		return user;
	}

	/**
	 * Transfer the data from User to UserDTO object.
	 * 
	 * @param userDTO User reference
	 * @return UserDTO reference
	 */
	public static final UserDTO toUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(user.getUserid());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setMobileNumber(user.getMobileNumber());
		userDTO.setEmailId(user.getEmailId());
		userDTO.setCountry(user.getCountry());
		userDTO.setCity(user.getCity());
		userDTO.setAddresses(toAddressDTOs(user.getAddresses()));
		return userDTO;
	}

	/**
	 * Transfer all object from UserDTO to User
	 * 
	 * @param userDTOs the var-args
	 * @return Set of User
	 */
	public static final List<User> toUser(List<UserDTO> userDTOs) {
		List<User> users = new ArrayList<>(userDTOs.size());
		for (UserDTO userDTO : userDTOs) {
			users.add(toUser(userDTO));
		}
		return users;
	}

	/**
	 * Transfer all object from UserDTO to User
	 * 
	 * @param userDTOs the var-args
	 * @return Set of User
	 */
	public static final List<UserDTO> toUserDTO(List<User> users) {
		List<UserDTO> userDTOs = new ArrayList<>(users.size());
		for (User user : users) {
			userDTOs.add(toUserDTO(user));
		}
		return userDTOs;
	}

	/**
	 * Transfer the data from Address to AddressDTO
	 * 
	 * @param address Address
	 * @return AddressDTO
	 */
	public static final AddressDTO toAddress(Address address) {
		return new AddressDTO(address.getAddressId(), address.getCity_village(), address.getTehsil(),
				address.getDistrict(), address.getState(), address.getPinCode());
	}

	/**
	 * Transfer the data from Addresses to AddressDTOs data from
	 * 
	 * @param addresses List of Address
	 * @return List of AddressDTO
	 */
	public static final List<AddressDTO> toAddressDTOs(List<Address> addresses) {
		List<AddressDTO> addressDTOs = new ArrayList<>();
		for (Address address : addresses) {
			addressDTOs.add(toAddress(address));
		}
		return addressDTOs;
	}

	/**
	 * Transfer the data from AddressDTO to Address
	 * 
	 * @param addressDTO AddressDTO
	 * @return Address
	 */
	public static final Address toAddress(AddressDTO addressDTO) {
		return new Address(addressDTO.getAddressId(), addressDTO.getCity_village(), addressDTO.getTehsil(),
				addressDTO.getDistrict(), addressDTO.getState(), addressDTO.getPinCode());
	}
	
	/**
	 * Transfer the data from AddressDTOs to Addresses  data 
	 *  
	 * @param addressDTOs  List of AddressDTO
	 * @return List of Address
	 */
	public static final List<Address> toAddresses(List<AddressDTO> addressDTOs) {
		List<Address> addresses = new ArrayList<>();
		for (AddressDTO addressDTO : addressDTOs) {
			addresses.add(toAddress(addressDTO));
		}
		return addresses;
	}
}
