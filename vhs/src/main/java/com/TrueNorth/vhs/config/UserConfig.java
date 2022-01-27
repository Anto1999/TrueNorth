package com.TrueNorth.vhs.config;

import com.TrueNorth.vhs.entity.User;
import com.TrueNorth.vhs.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User anto = new User(
                    "Anto",
                    18,
                    LocalDate.of(2000, Month.JANUARY,5),
                    "anto@gmail.com",
                    "hr"
            );

            User Marko = new User(
                    "Marko",
                    11,
                    LocalDate.of(2021, Month.JANUARY,5),
                    "marko@gmail.com",
                    "mama"

            );

            repository.saveAll(List.of(anto,Marko));
        };
    }
}
