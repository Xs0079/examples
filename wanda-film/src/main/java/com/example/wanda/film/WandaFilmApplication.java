package com.example.wanda.film;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WandaFilmApplication {

    public static void main(String[] args) {
        SpringApplication.run(WandaFilmApplication.class, args);
    }

}
