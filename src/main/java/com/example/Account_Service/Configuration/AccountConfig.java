package com.example.Account_Service.Configuration;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();

    }

}