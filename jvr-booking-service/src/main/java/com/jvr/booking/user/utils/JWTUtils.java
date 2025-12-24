package com.jvr.booking.user.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.amazonaws.client.builder.AdvancedConfig.Key;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTUtils {
	
	private static final long EXPIRATION_TIME=1000*60*24*7;
	
	private final SecretKey Key;
	
	public JWTUtils()
	{
		//String SecreteString = "q3x4m2XlU3sOHz5hT7FWsYUzTnCqjA6wK9eR1pY8jzKX0wVgD4u5fQ==";
		String SecreteString = "84356789369697645327597443269786349768738467TR678T348658683488763747837863766453874567386578367854873568783";

		//byte[] keyBytes = Base64.getDecoder().decode(SecreteString);

		byte[] keyBytes = Base64.getDecoder().decode(SecreteString.getBytes(StandardCharsets.UTF_8));
		this.Key =new SecretKeySpec(keyBytes, "HmacSHA256");
        //this.Key = Keys.hmacShaKeyFor(keyBytes); 

	}

	public String generateToken(UserDetails userDetails)
	{
		return Jwts.builder()
				.subject(userDetails.getUsername())
				.issuedAt(new Date(System.currentTimeMillis()))
				.expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(Key) //signWith(Key, Jwts.SIG.HS256)
				.compact();
	}
	
	public String extractUsername(String token)
	{
		return extractClaims(token, Claims::getSubject);
	}

	private <T> T extractClaims(String token, Function<Claims, T> claimsTFunction) {
		return claimsTFunction.apply(Jwts.parser().verifyWith(Key).build().parseSignedClaims(token).getPayload());
	}

	public boolean isValidToken(String token, UserDetails userDetails)
	{
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	private boolean isTokenExpired(String token) {
		return extractClaims(token, Claims::getExpiration).before(new Date());
	}
}
