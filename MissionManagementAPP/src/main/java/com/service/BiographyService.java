package com.service;

import java.util.ArrayList;
import java.util.List;

import model.Biography;

public class BiographyService {
	
	private List<Biography> biography = new ArrayList<Biography>();
	public BiographyService() {
		Biography bio1 = new Biography();
		bio1.setResponse("success");
		bio1.setId(70);
		bio1.setName("Batman");
		bio1.setFullName("Bruce Wayne");
		bio1.setAlterEgo("No alter egos found.");
		bio1.setPlaceOfBirth("Crest Hill, Bristol Township; Gotham County");
		bio1.setAlignment("good");
		bio1.setFirstApperance("Detective Comics #27");
		bio1.setPublisher("DC Comics");
		biography.add(bio1);
		
		
		Biography bio2 = new Biography();
		bio2.setResponse("success");
		bio2.setId(20);
		bio2.setName("Amazo");
		bio2.setFullName("");
		bio2.setAlterEgo("No alter egos found.");
		bio2.setPlaceOfBirth("-");
		bio2.setAlignment("bad");
		bio2.setFirstApperance("Brave and the Bold #30 (July, 1960)");
		bio2.setPublisher("DC Comics");
		biography.add(bio2);
	}
	
	public Biography getBioByAlignment(String alignment) {
		List<Biography> alignments = new ArrayList<Biography>();
		for(Biography b: biography) {
			if(b.getAlignment() == alignment) {
				return b;
			}
		}
		return null;
	}

}
