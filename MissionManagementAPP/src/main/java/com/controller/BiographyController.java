package com.controller;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import model.Biography;

@RestController()
@RequestMapping("/biography")
public class BiographyController {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Value("${resource.superheroAPI}")
	String serviceURL;
	
	@RequestMapping("/{id}")
	public Biography getBioById(@PathVariable Integer id) {
		final String uri = serviceURL +id+"/biography";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    Biography result = restTemplate.getForObject(uri, Biography.class);
	    
	    return result;
	}


}
