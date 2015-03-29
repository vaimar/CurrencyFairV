package com.as.currencyFair.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.as.currencyFair.service.user.UserService;

@Component
@Path("/users")

public class UserResource 
{
	@Autowired
	private UserService userService;
 
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
 
		String result = "Restful example : " + msg;
 
		return Response.status(200).entity(result).build();
 
	}
 
 
}