package com.techhub.springbootdemo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techhub.springbootdemo.model.User;

/**
 * The UserRepository
 * 
 * @author ramniwash
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	public List<User> findByCountry(String country);

	public List<User> findByCity(String city);
	
	public List<User> findByCountryAndCity(String country, String city);
	
	public List<User> findByCountryOrCity(String country, String city);
	
	/** JPQL(Java Persistence query language) Query
	 * Note :  Native query can also be written and defined as nativeQuery=true 
	 */
	@Query(value="SELECT u FROM User u WHERE u.mobileNumber = ?1 OR u.emailId=?1")
	public List<User> findByMobileNumberOrEmailId(String mobileNumberOrEmail);
	
	/** The Above query can also be written in this way */
//	@Query("SELECT u FROM User u WHERE u.mobileNumber = :mobileNumberOrEmail OR u.emailId=:mobileNumberOrEmail")
//	public List<User> findByMobileNumberOrEmailId(@Param("mobileNumberOrEmail") String mobileNumberOrEmail);
	
	@Transactional
	@Modifying
	@Query("UPDATE User u SET u.emailId =?2 WHERE u.userid = ?1")
	public int updateEmailId(String userId,String emailId);
	
	@Query("SELECT u FROM User u")
	public List<User> getAll(PageRequest pageRequest);
	
	@Query("SELECT u.username, a.state , a.pinCode  FROM User u , Address a WHERE a.user=u.userid")
	public List<Object[]> getUserNameStatePinCode();
 	
}
