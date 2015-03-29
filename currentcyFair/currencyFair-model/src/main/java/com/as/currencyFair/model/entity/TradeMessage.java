package com.as.currencyFair.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRADE_MESSAGE")
public class TradeMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2277260026731102364L;
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="USER_ID")
	private Long userId ;
	
	@Column(name="CURRENCY_FROM")
	private String currencyFrom ;
	
	@Column(name="CURRENCY_TO")
	private String currencyTo ;
	
	@Column(name="AMOUNT_SELL")
	private Double amountSell;
	
	@Column(name="AMOUNT_BUY")
	private Double amountBuy;
	
	@Column(name="RATE")
	private Double rate;
	
	@Column(name="timePlaced")
	private Date timePlaced;
	
	@Column(name="originatingCountry")
	private String originatingCountry ;
	
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getAmountSell() {
		return amountSell;
	}
	public void setAmountSell(Double amountSell) {
		this.amountSell = amountSell;
	}
	public Double getAmountBuy() {
		return amountBuy;
	}
	public void setAmountBuy(Double amountBuy) {
		this.amountBuy = amountBuy;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Date getTimePlaced() {
		return timePlaced;
	}
	public void setTimePlaced(Date timePlaced) {
		this.timePlaced = timePlaced;
	}
	public String getOriginatingCountry() {
		return originatingCountry;
	}
	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
	
	
}
