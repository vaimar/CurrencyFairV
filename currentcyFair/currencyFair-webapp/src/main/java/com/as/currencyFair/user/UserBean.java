package com.as.currencyFair.user;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.service.TradeMessageService;
import com.as.currencyFair.service.user.UserService;

@Component
@ManagedBean
@SessionScoped
public class UserBean{
 
	@Autowired
	UserService userService;
	
	@Autowired 
	TradeMessageService tradeMessageService;
 
	public void setUserBo(UserService userBo) {
		this.userService = userBo;
	}
 
	public String printMsgFromSpring() {
		tradeMessageService.insert(new TradeMessageDto(new Long("1"),"EUR", 3.0,3.0,3.0,"24-JAN-15 10:27:44","DE"));
		
		return userService.getMessage();
	}
}
 
