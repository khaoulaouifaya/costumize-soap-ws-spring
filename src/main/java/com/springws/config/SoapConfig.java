package com.springws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class SoapConfig {
    @Bean
    public WebServiceTemplate webServiceTemplate() {
        return new WebServiceTemplate();
    }
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.springws.generate.ws");
        return marshaller;
    }
    @Bean
    public CalculatorClient calculatorClient(Jaxb2Marshaller marshaller) {
        CalculatorClient client= new CalculatorClient();
        client.setDefaultUri("http://localhost:8080/wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
