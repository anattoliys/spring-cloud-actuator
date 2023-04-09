package ru.cluod.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    private final AppConfig appConfig;

    public TestController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @RequestMapping(path = "/config")
    public AppConfig printConfig() {
        return appConfig;
    }
}
