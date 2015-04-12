package com.as.currencyFair.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.as.currencyFair.model.dao.TradeMessageDao;
import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.model.entity.TradeMessage;
import com.as.currencyFair.service.TradeMessageService;

@Transactional
@Service("tradeMessageService")
public class TradeMessageServiceImpl implements TradeMessageService{

	@Autowired
	TradeMessageDao tradeMessageDao;
	     
	@Override
	public void insert(TradeMessageDto tradeMessage) {
		// TODO Auto-generated method stub
		tradeMessageDao.insert(tradeMessage);
		
	}

	@Override
	public List<TradeMessage> getList()
	{
		return tradeMessageDao.selectAll();
	}

}
