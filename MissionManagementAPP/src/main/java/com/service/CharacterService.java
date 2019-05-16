package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.CharacterModel;

@Service()
public class CharacterService {
	
	private List<CharacterModel> character = new ArrayList<CharacterModel>();
	public CharacterService() {
		
		CharacterModel char1 = new CharacterModel();
		char1.setResponse("sucess");
		char1.setId(70);
		char1.setName("Batman");
		character.add(char1);
		
		CharacterModel char2 = new CharacterModel();
		char2.setResponse("sucess");
		char2.setId(75);
		char2.setName("Beast");
		character.add(char2);	
	}
	
	public CharacterModel getName(String name) {
		
		for(CharacterModel c: character) {
			if(c.getName()==name) {
				return c;
			}
		}
		return null;
		
	}
	
	
	
	

}
