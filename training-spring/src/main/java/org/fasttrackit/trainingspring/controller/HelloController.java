package org.fasttrackit.trainingspring.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/salut") // Read operations
    public String getMessage() {
        String responseText = "<h1> Salut lume! </h1> \n Bun venit pe serverul nostru local!";
        return responseText;
    }


}
