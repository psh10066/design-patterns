package com.psh10066.designpatterns._02_structural_patterns._12_proxy._03_java.spring;

import com.psh10066.designpatterns._02_structural_patterns._12_proxy._02_after.DefaultGameService;
import com.psh10066.designpatterns._02_structural_patterns._12_proxy._02_after.GameService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GameService gameService) {
        return args -> gameService.startGame();
    }

    @Bean
    public GameService gameService() {
        return new DefaultGameService();
    }
}
