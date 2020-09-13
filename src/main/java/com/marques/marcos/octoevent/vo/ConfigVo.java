package com.marques.marcos.octoevent.vo;

import java.io.Serializable;

public class ConfigVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String content_type;
	private String insecure_ssl;
	private String secret;
	private String url;

	public ConfigVo() {
	}

	public ConfigVo(String content_type, String insecure_ssl, String secret, String url) {
		super();
		this.content_type = content_type;
		this.insecure_ssl = insecure_ssl;
		this.secret = secret;
		this.url = url;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public String getInsecure_ssl() {
		return insecure_ssl;
	}

	public void setInsecure_ssl(String insecure_ssl) {
		this.insecure_ssl = insecure_ssl;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
