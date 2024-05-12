package com.psh10066.designpatterns._03_behavioral_patterns._22_template._03_java;

import org.springframework.http.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TemplateInSpring {

    public static void main(String[] args) {
        // JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.execute("insert into users (name) values ('test')");

        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-COM-PERSIST", "NO");
        headers.set("X-COM-LOCATION", "USA");

        HttpEntity<String> entity = new HttpEntity<>(headers);
//        ResponseEntity<String> responseEntity = restTemplate
//            .exchange("http://localhost:8080/users", HttpMethod.GET, entity, String.class);
    }
}
