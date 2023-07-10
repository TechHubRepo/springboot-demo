package com.techhub.springbootdemo.constants;

import java.util.List;

import com.techhub.springbootdemo.dto.AddressDTO;
import com.techhub.springbootdemo.dto.UserDTO;

/**
 * The DummyData
 * 
 * @author ramniwash
 */
public final class Objects {

	/** The USER_DTO_LIST Constant */
	private static List<UserDTO> USER_DTO_LIST = List.of(
			new UserDTO("U0001", "Ram Niwash", "ram123", "ram@gmail.com", "9632587412", "INDIA", "Bangalore"),
			new UserDTO("U0002", "Purshtom Dass", "puru123", "puru@gmail.com", "9521458745", "INDIA", "Bangalore"),
			new UserDTO("U0003", "Kuldeep Singh", "kul123", "kul@gmail.com", "8546578514", "RUSSIA", "Moscow"),
			new UserDTO("U0004", "Sajjan Kumar", "sajan123", "sajan@gmail.com", "7412589632", "INDIA", "Bangalore"),
			new UserDTO("U0005", "Prem Kumar", "prem123", "prem@gmail.com", "8454542513", "RUSSIA", "Moscow"),
			new UserDTO("U0006", "Naresh Kumar", "naresh123", "naresh@gmail.com", "9632587412", "INDIA", "Gurugram"),
			new UserDTO("U0007", "Sumit Kumar", "sumit123", "sumit@gmail.com", "8542112356", "INDIA", "Gurugram"),
			new UserDTO("U0008", "Sandeep Kumar", "sandeep123", "sandeep@gmail.com", "8541252520", "RUSSIA", "Perm"),
			new UserDTO("U0009", "Diwaker Gupta", "diwaker123", "diwaker@gmail.com", "9652412329", "RUSSIA", "Perm")
	);
	static {
		USER_DTO_LIST.get(0).setAddresses(List.of(new AddressDTO("A0001","BTM","Bangalore","Bangalore","Karanataka",854512)));
		USER_DTO_LIST.get(1).setAddresses(List.of(new AddressDTO("A0002","BTM","Bangalore","Bangalore","Karanataka",78572)));
		USER_DTO_LIST.get(2).setAddresses(List.of(new AddressDTO("A0003","Sirsa","Sirsa","Sirsa","Haryana",875785)));
		USER_DTO_LIST.get(3).setAddresses(List.of(new AddressDTO("A0004","BTM","Bangalore","Bangalore","Karanataka",585578)));
		USER_DTO_LIST.get(4).setAddresses(List.of(new AddressDTO("A0005","Sirsa","Sirsa","Sirsa","Haryana",578554)));
		USER_DTO_LIST.get(5).setAddresses(List.of(new AddressDTO("A0006","Sirsa","Sirsa","Sirsa","Haryana",125568)));
		USER_DTO_LIST.get(6).setAddresses(List.of(new AddressDTO("A0007","Gurugram","Gurugram","Gurugram","Haryana",125568)));
		USER_DTO_LIST.get(7).setAddresses(List.of(new AddressDTO("A0008","ABC","XYZ","C","Moscow",8578542)));
		USER_DTO_LIST.get(8).setAddresses(List.of(new AddressDTO("A0009","XYZ","CCC","D","Moscow",5785855)));
	}

	/** The private constructor */
	private Objects() {
	}

	public static final List<UserDTO> getUsersDTOs() {
		return USER_DTO_LIST;
	}
}
