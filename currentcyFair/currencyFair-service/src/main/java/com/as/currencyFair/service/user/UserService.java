package com.as.currencyFair.service.user;

import java.util.List;

import com.as.currencyFair.model.entity.User;



public interface UserService {

	User findUserByUsernameWithWarehouses(String login);
	
	User findUserByid(Long id);
	
	List<User> findAllUsers();

	void save(User user);
	
	void saveOrUpdate(User user);

	User initializeUser();

	String md5(String input);

	Long getUserCurrentSequenceVal();

	String getMessage();
}
