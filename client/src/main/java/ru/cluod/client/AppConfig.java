package ru.cluod.client;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@Getter
@Setter
public class AppConfig {

    private String prop1;
    private String prop2;
    private String testProp;
}
