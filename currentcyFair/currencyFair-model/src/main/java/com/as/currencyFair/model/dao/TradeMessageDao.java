package com.as.currencyFair.model.dao;

import java.util.List;

import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.model.entity.TradeMessage;


public interface TradeMessageDao {

	public static final String SELECT_QUERY = "select t from TradeMessage t";
	
	List<TradeMessage> selectAll();

	void insert(TradeMessageDto tradeMessage);
	

}
