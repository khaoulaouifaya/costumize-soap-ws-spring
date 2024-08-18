package com.springws.controller;


import com.springws.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class homeController {
    private final CalculatorService calculatorService;
    @GetMapping()
    public String home() {
        return "index";
    }

    @GetMapping("/add")
    public int add() {
        return calculatorService.add(1, 1);
    }
}
