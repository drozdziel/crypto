package com.drozdziel.crypto.aes.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Created by pdrozdziel on 24.01.15.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.drozdziel.crypto.aes")
public class AESConfiguration {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AESConfiguration.class, args);
    }
}
