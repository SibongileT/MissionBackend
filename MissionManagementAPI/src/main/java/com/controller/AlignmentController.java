package com.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import model.Biography;

@RestController()
@RequestMapping("/alignment")
public class AlignmentController {
	
	 RestTemplate restTemplate = new RestTemplate();
	 
	@RequestMapping()
	public Biography getAlignmentById(@PathVariable Integer id) {
		final String uri = "https://superheroapi.com/api/1901642809941714/"+id+"/biography";
		//String alignment = json.getJSONObject("LabelData").getString("slogan");
	    Biography result = restTemplate.getForObject(uri, Biography.class);
	    return result;
	}
	

}
