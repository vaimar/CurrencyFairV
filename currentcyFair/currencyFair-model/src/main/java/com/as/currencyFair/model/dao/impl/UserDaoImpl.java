package com.as.currencyFair.model.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.as.currencyFair.model.dao.UserDao;
import com.as.currencyFair.model.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	/* (non-Javadoc)
	 * @see com.as.currencyFair.model.dao.impl.UserDao#getUserByLoginWithWarehouses(java.lang.String)
	 */
	@Override
	public User getUserByLoginWithWarehouses(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.as.currencyFair.model.dao.impl.UserDao#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.as.currencyFair.model.dao.impl.UserDao#getUserById(java.lang.Long)
	 */
	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.as.currencyFair.model.dao.impl.UserDao#getUserSequenceNextVal()
	 */
	@Override
	public Long getUserSequenceNextVal() {
		// TODO Auto-generated method stub
		return null;
	}

}
