package com.serve.navicure.SoapClient;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import navicure.wsdl.SubmitRequestType;
import navicure.wsdl.ResponseType;
import navicure.wsdl.SecurityHeaderType;
import navicure.wsdl.ObjectFactory;

/*
 * CommandLineRunner is used to allow executing custom code before Spring Boot application finishes starting up
 */

@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	@Qualifier("webServiceTemplate")
	private WebServiceTemplate webServiceTemplate;

	//@Value("#{'${service.soap.action}'}")
	//private String serviceSoapAction;

	@Value("#{'${service.user.id}'}")
	private String serviceUserId;

	@Value("#{'${service.user.password}'}")
	private String serviceUserPassword;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
		System.exit(0);
    }
    
    public void run(String... args) throws Exception {
		final SubmitRequestType soapRequest = createSoapRequest();
		@SuppressWarnings("unchecked")
		final JAXBElement<ResponseType> jaxbElement = (JAXBElement<ResponseType>) sendAndRecieve(soapRequest);
		final ResponseType soapResponse = jaxbElement.getValue();
		System.out.println("Status Code = " + soapResponse.getStatusHeader().getStatusCode());
	}

	private Object sendAndRecieve(SubmitRequestType submitRequestType) {
		return webServiceTemplate.marshalSendAndReceive(submitRequestType,
				new WebServiceMessageCallback() {
					public void doWithMessage(WebServiceMessage message)
							throws IOException, TransformerException {
						SoapMessage soapMessage = (SoapMessage) message;
						//soapMessage.setSoapAction(serviceSoapAction);
						org.springframework.ws.soap.SoapHeader soapheader = soapMessage
								.getSoapHeader();
						final StringWriter out = new StringWriter();
						webServiceTemplate.getMarshaller().marshal(
								getHeader(serviceUserId, serviceUserPassword),
								new StreamResult(out));
						Transformer transformer = TransformerFactory
								.newInstance().newTransformer();
						transformer.transform(new StringSource(out.toString()),
								soapheader.getResult());
					}
				});
	}

	private Object getHeader(final String userId, final String password) {
		final ObjectFactory objectFactory = new ObjectFactory();
		final SecurityHeaderType header = objectFactory
				.createSecurityHeaderType();
		header.setSubmitterIdentifier(userId);
		header.setSubmitterPassword(password);
		
		return header;
	}

	private SubmitRequestType createSoapRequest() {
		final ObjectFactory objectFactory = new ObjectFactory();
		final SubmitRequestType soapRequest = objectFactory.createSubmitRequestType();
		soapRequest.setTimeout("31");
		soapRequest.setTransactionType("E");
		soapRequest.setSubmittedAnsiVersion("5010");
		soapRequest.setResultAnsiVersion("5010");
		soapRequest.setSubmitterSubmissionId("1");
		soapRequest.setProcessingOption("R");
		return soapRequest;
	}

	public void setWebServiceTemplate(final WebServiceTemplate template) {
		this.webServiceTemplate = template;
	}


}
