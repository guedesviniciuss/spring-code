package com.example.demo.infoapp;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ToString
@ConfigurationProperties(prefix = "info.app")
@Data
public class InfoApp {
    private String name;

    private String description;

    private String version;
}
