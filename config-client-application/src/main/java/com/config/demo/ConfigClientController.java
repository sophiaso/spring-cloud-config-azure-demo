package com.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigClientController {
    @Value("${config.background.color}")
    private String backgroundColor;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("name", "world");
        model.addAttribute("backgroundcolor", backgroundColor);
        return "index";
    }
}
