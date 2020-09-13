package com.marques.marcos.octoevent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marques.marcos.octoevent.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{
	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Event obj WHERE obj.hook_id = :hook_id")
	public Event findHook_id(@Param("hook_id") Integer hook_id);
}


