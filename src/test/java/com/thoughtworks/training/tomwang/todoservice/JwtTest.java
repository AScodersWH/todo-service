//package com.thoughtworks.training.tomwang.todoservice;
//
//import com.sun.org.apache.xerces.internal.util.PropertyState;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.junit.Test;
//
//import java.time.Instant;
//import java.time.temporal.ChronoUnit;
//import java.util.Date;
//import java.util.HashMap;
//
//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
//
//public class JwtTest {
//    @Test
//    public void generateJwt(){
//        HashMap<String,Object> claims = new HashMap<>();
//        claims.put("name","ellen");
//        claims.put("role","wifi");
//
//       String token;
//        token = Jwts.builder()
//                 .addClaims(claims)
//                // .setExpiration(Date.from(Instant.now().minus(1,ChronoUnit.DAYS)))
//                 .signWith(SignatureAlgorithm.HS512,"kitty".getBytes())
//                 .compact();
//
//        Claims body = Jwts.parser()
//                .setSigningKey("kitty".getBytes())
//                .parseClaimsJws(token)
//                .getBody();
////        assertThat(body.get("name"),is("ellen"));
////        assertThat(body.get("role"),is("dev"));
//        System.out.print(body);
//    }
//
//}
