package com.marques.marcos.octoevent.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.marques.marcos.octoevent.vo.HookVo;
import com.marques.marcos.octoevent.vo.RepositoryVo;
import com.marques.marcos.octoevent.vo.SenderVo;


@Entity
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String zen;
	private Integer hook_id;
	private HookVo hook;
	private RepositoryVo repository;
	private SenderVo sender;
	
		
	public Event() {
	}


	public Event(Integer id, String zen, Integer hook_id, HookVo hook, RepositoryVo repository, SenderVo sender) {
		super();
		this.id = id;
		this.zen = zen;
		this.hook_id = hook_id;
		this.hook = hook;
		this.repository = repository;
		this.sender = sender;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getZen() {
		return zen;
	}


	public void setZen(String zen) {
		this.zen = zen;
	}


	public Integer getHook_id() {
		return hook_id;
	}


	public void setHook_id(Integer hook_id) {
		this.hook_id = hook_id;
	}


	public HookVo getHook() {
		return hook;
	}


	public void setHook(HookVo hook) {
		this.hook = hook;
	}


	public RepositoryVo getRepository() {
		return repository;
	}


	public void setRepository(RepositoryVo repository) {
		this.repository = repository;
	}


	public SenderVo getSender() {
		return sender;
	}


	public void setSender(SenderVo sender) {
		this.sender = sender;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
