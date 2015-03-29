package com.as.currencyFair.model.dao;

import java.util.List;

import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.model.entity.TradeMessage;


public interface TradeMessageDao {

	List<TradeMessage> selectAll();

	void insert(TradeMessageDto tradeMessage);
	

}
