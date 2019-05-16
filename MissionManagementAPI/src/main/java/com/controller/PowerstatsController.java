package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.PowerstatsService;


import model.Powerstats;

@RestController
@RequestMapping("/powerstats")
public class PowerstatsController {
	
	@Autowired
	PowerstatsService ps;
	
	@Value("${resource.superheroAPI}")
	String serviceURL;
	
	@RequestMapping("/{id}")
	public Powerstats getPowerstatsById(@PathVariable Integer id) {
		final String uri = "https://superheroapi.com/api/1901642809941714/"+id+"/powerstats";
	    RestTemplate restTemplate = new RestTemplate();
	    Powerstats result = restTemplate.getForObject(uri, Powerstats.class);
	    
	    return result;
	}

}
