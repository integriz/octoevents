package com.marques.marcos.octoevent.vo;

import java.io.Serializable;

public class LastResponseVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;
	private String status;
	private String message;

	public LastResponseVo() {
	}

	public LastResponseVo(String code, String status, String message) {
		super();
		this.code = code;
		this.status = status;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
