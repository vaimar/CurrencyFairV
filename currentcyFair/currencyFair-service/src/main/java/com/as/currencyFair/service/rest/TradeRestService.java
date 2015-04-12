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
	        String currencyTo = (String) jObject.get("currencyTo"); 
	        Double amountSell = getDesiredInstance(jObject.get("amountSell"));
	        Double amountBuy = getDesiredInstance(jObject.get("amountBuy"));
	        Double rate =getDesiredInstance(jObject.get("rate"));
	        String timePlaced = (String) jObject.get("timePlaced");
	        String originatingCountry = (String) jObject.get("originatingCountry");
	       
	        TradeMessageDto tradeMessage = new TradeMessageDto(userId, currencyFrom, amountSell, amountBuy, rate, timePlaced, originatingCountry, currencyTo);
	        tradeMessageService.insert(tradeMessage);
	        
	        // return HTTP resonse 200 in case of success
	        return Response.status(200).entity(crunchifyBuilder.toString()).build();

	  }
	
	 
	  Double getDesiredInstance(Object obj)
	  {
		  if(obj !=null)
		  {
		   if (obj instanceof Integer) {
                           return  Double.valueOf(((Integer)obj).toString());
                           
                    }
		   else if (obj instanceof Double) {
                            return (Double) obj;
		   }
		 }
		return null;
	  }
	
 
}