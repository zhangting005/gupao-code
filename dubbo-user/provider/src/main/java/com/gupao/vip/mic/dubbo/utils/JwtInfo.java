package com.gupao.vip.mic.dubbo.utils;
/**
 * ztadd
 * @author 张婷
 * 自定义jwt属性
 */
public class JwtInfo {
	
	private String uid;
	
	public JwtInfo(String uid) {
		super();
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
