package com.example.request.body.requestbodyexample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.body.requestbodyexample.model.User;
import com.google.gson.Gson;

@RestController
public class MainController {
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String getResponse(@RequestBody User user) {
		
		Gson gson = new Gson();

		return gson.toJson(user);
	}

}
