package com.as.currencyFair.service;

import java.util.List;

import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.model.entity.TradeMessage;


public interface TradeMessageService {

	void insert(TradeMessageDto tradeMessage);

	List<TradeMessage> getList();

	
}
