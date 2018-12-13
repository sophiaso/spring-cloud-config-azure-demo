package com.config.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigClientController {
    private ConfigProperties properties;

    public ConfigClientController(ConfigProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("name", "world");
        model.addAttribute("backgroundcolor", properties.getColor());
        return "index";
    }
}
