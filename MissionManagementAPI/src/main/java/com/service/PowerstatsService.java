package com.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Biography;
import model.Powerstats;

@Service()
public class PowerstatsService {

	List<Powerstats> powerstats= new ArrayList<Powerstats>();

	public Powerstats getPowerById(Integer id) {
		for (Powerstats p: powerstats) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public List<Powerstats> getAll(){
		return powerstats;
	}
}
