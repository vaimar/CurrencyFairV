package com.as.currencyFair.service.user;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.as.currencyFair.model.dao.UserDao;
import com.as.currencyFair.model.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	

	
	@Transactional(readOnly=true)
	public List<User> findAllUsers() {
		return userDao.getAllUsers();
	}
	
	

	
	@Override
	public User initializeUser() {
		User user = new User();
		/// We get the current sequence value and increment of 1 so we don't modify the sequence before saving		
		Long tmpId = findUserSequenceNextVal();
		user.setId(tmpId);
		return user;
	}
	
	
	
	@Override
	public String md5(String input) {
        
        String md5 = null;
         
        if(null == input) return null;
         
        try {
             
        //Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
         
        //Update input string in message digest
        digest.update(input.getBytes(), 0, input.length());
 
        //Converts message digest value in base 16 (hex)
        md5 = new BigInteger(1, digest.digest()).toString(16);
 
        } catch (NoSuchAlgorithmException e) {
 
            e.printStackTrace();
        }
        return md5;
    }
	
	private Long findUserSequenceNextVal() {
		return userDao.getUserSequenceNextVal();
	}

	@Override
	public User findUserByid(Long id) {
		return userDao.getUserById(id);
	}




	@Override
	public User findUserByUsernameWithWarehouses(String login) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Long getUserCurrentSequenceVal() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "hello spring!";
	}
	


}
