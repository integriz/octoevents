package com.marques.marcos.octoevent.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HookVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type;
	private Integer id;
	private String name;
	private Boolean active;
	private List<String> events;
	private ConfigVo config;
	private Date updated_at;
	private Date created_at;
	private String url;
	private String test_url;
	private String ping_url;
	private LastResponseVo last_response;

	public HookVo() {
	}

	public HookVo(String type, Integer id, String name, Boolean active, List<String> events, ConfigVo config, Date updated_at,
			Date created_at, String url, String test_url, String ping_url, LastResponseVo last_response) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
		this.active = active;
		this.events = events;
		this.config = config;
		this.updated_at = updated_at;
		this.created_at = created_at;
		this.url = url;
		this.test_url = test_url;
		this.ping_url = ping_url;
		this.last_response = last_response;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<String> getEvents() {
		return events;
	}

	public void setEvents(List<String> events) {
		this.events = events;
	}

	public ConfigVo getConfig() {
		return config;
	}

	public void setConfig(ConfigVo config) {
		this.config = config;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTest_url() {
		return test_url;
	}

	public void setTest_url(String test_url) {
		this.test_url = test_url;
	}

	public String getPing_url() {
		return ping_url;
	}

	public void setPing_url(String ping_url) {
		this.ping_url = ping_url;
	}

	public LastResponseVo getLast_response() {
		return last_response;
	}

	public void setLast_response(LastResponseVo last_response) {
		this.last_response = last_response;
	}

}
