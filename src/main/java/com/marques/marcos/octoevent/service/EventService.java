package com.marques.marcos.octoevent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marques.marcos.octoevent.domain.Event;
import com.marques.marcos.octoevent.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;
	
	public Event insert(Event obj) {
		obj.setId(null);//garante que estou inserindo um objeto novo.
		return repository.save(obj);
	}
	
	public Event find(Integer id) {
		Event event = repository.findHook_id(id);
		return event;
	}
}
