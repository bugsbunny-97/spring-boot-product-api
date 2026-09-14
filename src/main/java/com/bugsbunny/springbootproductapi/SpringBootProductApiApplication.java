package com.bugsbunny.springbootproductapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProductApiApplication.class, args);
    }

}
