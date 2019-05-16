package com.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.service.WorkService;
import model.Work;


@RestController
@RequestMapping("/work")
public class WorkController {

	@Autowired
	WorkService ws;
	
	@RequestMapping(value = "/all" , method = RequestMethod.GET)
	public Hashtable<Integer,Work> getAll(){
		return ws.getAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Work getWork(@PathVariable("id") Integer id) {
		return ws.getWork(id);
	}
}
