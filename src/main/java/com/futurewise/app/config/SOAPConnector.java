package com.futurewise.app.config;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.addressing.client.ActionCallback;

import java.net.URI;
import java.net.URISyntaxException;

public class SOAPConnector extends WebServiceGatewaySupport {

    public Object callWebService(String baseUrl, Object request) {
        Object response = null;
        try {

            WebServiceTemplate webServiceTemplate = getWebServiceTemplate();

            ActionCallback callback = new ActionCallback(new URI(baseUrl));

            response = webServiceTemplate.marshalSendAndReceive(request, callback/*,new SoapActionCallback(url)*/);

        } catch (URISyntaxException use) {
            use.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        } finally {

        }
        return response;
    }
}
