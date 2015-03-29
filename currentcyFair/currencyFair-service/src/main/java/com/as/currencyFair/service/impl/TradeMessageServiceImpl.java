package com.as.currencyFair.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.currencyFair.model.dao.TradeMessageDao;
import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.service.TradeMessageService;

@Service("tradeMessageService")
public class TradeMessageServiceImpl implements TradeMessageService{

	@Autowired
	TradeMessageDao tradeMessageDao;
	     
	@Override
	public void insert(TradeMessageDto tradeMessage) {
		// TODO Auto-generated method stub
		tradeMessageDao.insert(tradeMessage);
		
	}


}
