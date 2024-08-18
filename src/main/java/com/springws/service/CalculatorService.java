package com.springws.service;

import com.springws.config.CalculatorClient;
import com.springws.generate.ws.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    @Autowired
    private final CalculatorClient calculatorClient;


    public CalculatorService(CalculatorClient calculatorClient) {
        this.calculatorClient = calculatorClient;
    }

    public int add(int a, int b) {
        AddResponse response = calculatorClient.add(a, b);
        return response.getAddResult();
    }
}
