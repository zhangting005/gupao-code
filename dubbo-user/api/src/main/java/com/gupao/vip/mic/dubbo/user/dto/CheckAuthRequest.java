package com.gupao.vip.mic.dubbo.user.dto;

import java.io.Serializable;

import com.gupao.vip.mic.dubbo.user.abs.AbstractRequest;

public class CheckAuthRequest extends AbstractRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "CheckAuthRequest [token=" + token + "]";
	}
	
}
