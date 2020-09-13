package com.marques.marcos.octoevent.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marques.marcos.octoevent.domain.Event;
import com.marques.marcos.octoevent.service.EventService;

@RestController
@RequestMapping(value="/issues")
public class IssueResource {
	
	@Autowired
	private EventService service;
	
	@RequestMapping(value="/{id}/events", method=RequestMethod.GET)
	public ResponseEntity<Event> find(@PathVariable Integer id) {
		Event obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}