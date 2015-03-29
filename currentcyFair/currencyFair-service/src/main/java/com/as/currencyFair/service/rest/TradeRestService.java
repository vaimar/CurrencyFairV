package com.as.currencyFair.service.rest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.currencyFair.model.dto.TradeMessageDto;
import com.as.currencyFair.service.TradeMessageService;

@Service
@Path("/message")
public class TradeRestService {
 
	@Autowired
	private TradeMessageService tradeMessageService;
	
	  @POST
	  @Path("/tradeService")
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response sayPlainTextHello(InputStream incomingData) throws Exception {

	      StringBuilder crunchifyBuilder = new StringBuilder();
	        try {
	            BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
	            String line = null;
	            while ((line = in.readLine()) != null) {
	                crunchifyBuilder.append(line);
	            }
	        } catch (Exception e) {
	            System.out.println("Error Parsing: - ");
	        }
	        System.out.println("Data Received: " + crunchifyBuilder.toString());
	 
	        JSONObject jObject  = new JSONObject(crunchifyBuilder.toString());
	        Long userId = (Long.valueOf((String) jObject.get("userId")));
	        String currencyFrom = (String) jObject.get("currencyFrom");
	      Double amountSell = null ;//= Double.valueOf((String)jObject.get("amountSell"));
	        Double amountBuy = null ; //=Double.valueOf((String)jObject.get("amountBuy"));
	        Double rate = null ;//=Double.valueOf((String)jObject.get("rate"));
	        String timePlaced = (String) jObject.get("timePlaced");
	        String originatingCountry = (String) jObject.get("originatingCountry");
	       
	        TradeMessageDto tradeMessage = new TradeMessageDto(userId, currencyFrom, amountSell, amountBuy, rate, timePlaced, originatingCountry);
	        tradeMessageService.insert(tradeMessage);
	        
	        // return HTTP resonse 200 in case of success
	        return Response.status(200).entity(crunchifyBuilder.toString()).build();

	  }
	 //"userId": "134256", "currencyFrom": "EUR", "currencyTo": "GBP", "amountSell": 1000, "amountBuy": 747.10, "rate": 0.7471, "timePlaced" : "24-JAN-15 10:27:44", "originatingCountry" : "FR"}
		//{"userId": "134256", "currencyFrom": "EUR", "currencyTo": "GBP", "amountSell": 1000, "amountBuy": 747.10, "rate": 0.7471, "timePlaced" : "24-JAN-15 10:27:44", "originatingCountry" : "FR"}
	
	 
	
 
}