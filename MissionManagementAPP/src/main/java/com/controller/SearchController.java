package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.CharacterService;

import model.CharacterModel;

@RestController()
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	CharacterService cs;
	
	@GetMapping("/name")
	public CharacterModel getName(@RequestParam("name") String name) {
		return cs.getName(name);
		
	}
		

}
