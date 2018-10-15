package com.netcracker.controllers;

import com.netcracker.models.Developer;
import com.netcracker.repos.DeveloperRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    private final DeveloperRepository developerRepository;

    public MainController(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }


    @GetMapping("/developer")
    public String developer(Map<String, Object> model) {
        Iterable<Developer> developer = developerRepository.findAll();
        model.put("developer", developer);
        return "developer";
    }

}
