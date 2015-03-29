package com.as.currencyFair.model.dao;

import java.util.List;

import com.as.currencyFair.model.entity.User;

public interface UserDao {

	public abstract User getUserByLoginWithWarehouses(String login);

	public abstract List<User> getAllUsers();

	public abstract User getUserById(Long id);

	public abstract Long getUserSequenceNextVal();

}