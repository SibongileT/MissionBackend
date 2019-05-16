package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Biography;



@Service()
public class BiographyService {
	

	
	private List<Biography> biography= new ArrayList<Biography>();
	

	public Biography getBioById(Integer id) {
		for (Biography b: biography) {
			if (b.getId() == id) {
				return b;
			}
		}
		return null;	
	}
	public List<Biography> getBioByAlignment(String alignment) {
		List<Biography> alignments = new ArrayList<Biography>();
		for (Biography b: biography) {
			if(b.getAlignment() == alignment) {
				alignments.add(b);
			}
		}
		return alignments;
	}
	public List<Biography> getAll(){
		return biography;
	}

}
