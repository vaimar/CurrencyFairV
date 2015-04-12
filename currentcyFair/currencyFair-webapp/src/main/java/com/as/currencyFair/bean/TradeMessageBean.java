package com.as.currencyFair.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.as.currencyFair.model.entity.TradeMessage;
import com.as.currencyFair.service.TradeMessageService;


@Controller
@ManagedBean(name="tradeMessageBean")
@ViewScoped
public class TradeMessageBean {
	
	@Autowired
	TradeMessageService tradeMessageService;
	
	private String selectedCurrency;
	
	
	
	public List<TradeMessage> getList()
	{
		return tradeMessageService.getList();
		
	}
	
	public String printMsgFromSpring() {
		return "test";
	}

	public String getSelectedCurrency() {
		return selectedCurrency;
	}

	public void setSelectedCurrency(String selectedCurrency) {
		this.selectedCurrency = selectedCurrency;
	}
}
