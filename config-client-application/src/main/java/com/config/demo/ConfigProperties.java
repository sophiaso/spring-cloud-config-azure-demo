package com.config.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config.background") // For sample only, this config.background is not a common prefix
public class ConfigProperties {
    private String color;

    public ConfigProperties() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
