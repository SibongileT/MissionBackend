package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.BiographyService;

import model.Biography;

@RestController()
@RequestMapping("/alignment")
public class AlignmentController {
	
	RestTemplate restTemplate = new RestTemplate();
	BiographyService bs = new BiographyService();
	
	
	@RequestMapping("/{alignment}")
	public Biography getAlignmentById(@PathVariable String alignment) {
		return bs.getBioByAlignment(alignment) ;
	}
	

}
