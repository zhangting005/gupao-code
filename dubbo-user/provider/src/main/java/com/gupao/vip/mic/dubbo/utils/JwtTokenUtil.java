package com.gupao.vip.mic.dubbo.utils;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import org.joda.time.DateTime;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * 
 * @author 张婷
 * 生成token的工具类
 * 用到一个第三方提供的包
 * <dependency>
    	<groupId>io.jsonwebtoken</groupId>
    	<artifactId>jjwt</artifactId>
    	<version>0.7.0</version>
   </dependency>
 */
public class JwtTokenUtil {
	
	private static Key getKeyInstance() {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		byte[] dc = DatatypeConverter.parseBase64Binary("gupao-user");
		return new SecretKeySpec(dc,signatureAlgorithm.getJcaName());
	}
	//生成token的方法
	public static String gerneratorToken(JwtInfo jwtInfo,int expire) {
		Jwts.builder().claim(JwtConstants.JWT_KEY_USER_ID,jwtInfo.getUid())
		.setExpiration(DateTime.now().plusSeconds(expire).toDate())
		.signWith(SignatureAlgorithm.HS256,getKeyInstance()).compact();
		return null;
	}
	
	//根据token获得token中的信息
	public static JwtInfo getTokenInfo(String token) {
		Jws<Claims> claimsJws = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(token);
		Claims claims = claimsJws.getBody();
		return new JwtInfo(claims.get(JwtConstants.JWT_KEY_USER_ID).toString());
	}

}
