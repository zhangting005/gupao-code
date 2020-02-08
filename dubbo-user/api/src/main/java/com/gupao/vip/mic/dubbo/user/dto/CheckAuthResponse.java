package com.gupao.vip.mic.dubbo.user.dto;

import java.io.Serializable;

import com.gupao.vip.mic.dubbo.user.abs.AbstractResponse;

public class CheckAuthResponse extends AbstractResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "CheckAuthResponse [uid=" + uid + "]";
	}
	
}
