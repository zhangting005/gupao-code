package com.gupao.vip.mic.dubbo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gupao.vip.mic.dubbo.utils.JwtInfo;
import com.gupao.vip.mic.dubbo.utils.JwtTokenUtil;

@Component
public class JwtTokenService {
	
	@Value("${jwt.expire}")
	private int expire;
	
	public String generatorToken(JwtInfo jwtInfo) {
		
		return JwtTokenUtil.gerneratorToken(jwtInfo, expire);
	}
	
	public JwtInfo getInfoFromToken(String token) {
		return JwtTokenUtil.getTokenInfo(token);
	}

}
