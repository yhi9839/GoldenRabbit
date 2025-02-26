package GoldenRabbit.Buzz.apiPayLoad.config;/*
package muit.backend.config.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import muit.backend.domain.entity.member.Member;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.*;

@RequiredArgsConstructor
@Service
public class ATokenProvider {
    // 토큰을 생성하고, 올바른 토큰인지 유효성 검사를 하고, 토큰에서 필요한 정보를 가져오는 클래스

    private final AJwtProperties AJwtProperties;

    public String generateToken(Member member, Duration expiredAt) {
        Date now = new Date();
        return makeToken(new Date(now.getTime() + expiredAt.toMillis()), member);

    }

    // JWT 토큰 생성 메서드
    private String makeToken(Date date, Member member) {
        Date now = new Date();

        return Jwts.builder()
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE) // 헤더 내용, JWT
                .setIssuer(AJwtProperties.getIssuer()) // 이슈어,
                .setIssuedAt(now) // iat: 현재 시간
                .setExpiration(date) // exp : expiry 멤버 변수값
                .setSubject(member.getEmail()) // sub: 사용자의 이메일
                .claim("id", member.getId()) // id: 사용자 아이디
                .signWith(SignatureAlgorithm.HS256, AJwtProperties.getSecretKey()) // HS255사용할거다
                .compact();

    }

    // JWT토큰 유효성 검증 메서드
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(AJwtProperties.getSecretKey()) // 비밀번호 파싱
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {return false;}
    }

    // 토큰 기반으로 인증 정보 가져오는 메서드
    public Authentication getAuthentication(String token) {
        Claims claims = getClaims(token);
        Set<SimpleGrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        return new UsernamePasswordAuthenticationToken(new User(claims.getSubject(),"", authorities),token, authorities);
    }

    // 토큰 기반으로 사용자 id 가져오는 메서드
    public Long getMemberIdFromToken(String token) {
        Claims claims = getClaims(token);
        return claims.get("id", Long.class);
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(AJwtProperties.getSecretKey())
                .parseClaimsJws(token)
                .getBody();
    }
}
*/
