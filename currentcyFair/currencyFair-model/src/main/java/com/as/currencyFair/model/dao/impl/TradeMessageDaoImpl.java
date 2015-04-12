package com.as.currencyFair.model.dao.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.as.currencyFair.model.dao.TradeMessageDao;
import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.model.entity.TradeMessage;


@Repository("tradeMessageDao")
public class TradeMessageDaoImpl implements TradeMessageDao {

	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insert(TradeMessageDto tradeMessageDto) {
		TradeMessage tradeMessage = new TradeMessage();
		tradeMessage.setAmountBuy(tradeMessageDto.getAmountBuy());
		tradeMessage.setAmountSell(tradeMessageDto.getAmountSell());
		tradeMessage.setCurrencyFrom(tradeMessageDto.getCurrencyFrom());
		tradeMessage.setCurrencyTo(tradeMessageDto.getCurrencyTo());
		tradeMessage.setUserId(tradeMessageDto.getUserId());
		tradeMessage.setOriginatingCountry(tradeMessageDto.getOriginatingCountry());
		tradeMessage.setRate(tradeMessageDto.getRate());
		DateFormat formatter ; 
		Date date ; 
		formatter = new SimpleDateFormat("dd-MMM-yy hh:mm:ss", Locale.ENGLISH);
		
		try {
			tradeMessage.setTimePlaced(formatter.parse(tradeMessageDto.getTimePlaced()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tradeMessage.setOriginatingCountry(tradeMessageDto.getOriginatingCountry());
		entityManager.persist(tradeMessage);
		entityManager.flush();
	}

	@Override
	public List<TradeMessage> selectAll() {
		Query query = entityManager.createQuery(SELECT_QUERY);
		List<TradeMessage> tradeMessages = (List<TradeMessage>) query.getResultList();
		return tradeMessages;
	}
}
