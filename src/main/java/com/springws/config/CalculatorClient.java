package com.springws.config;

import com.springws.generate.ws.Add;
import com.springws.generate.ws.AddResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse add(int intA, int intB) {
        Add request = new Add();
        request.setIntA(intA);
        request.setIntB(intB);

        AddResponse response = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", request,
                        new SoapActionCallback("http://tempuri.org/Add"));

        return response;
    }


}
