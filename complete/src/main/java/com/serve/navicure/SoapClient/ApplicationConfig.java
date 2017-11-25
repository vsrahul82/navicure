package com.serve.navicure.SoapClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
@EnableWebMvc
@PropertySource(value = { "classpath:application.properties" })
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	@Value("#{'${service.endpoint}'}")
	private String serviceEndpoint;

	@Value("#{'${marshaller.package}'}")
	private String marshallerPackage;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public SaajSoapMessageFactory messageFactory() {
		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
		/* required to set SoapVersion to 1.2 for avoiding
		 * Could not create message from InputStream: Unable to internalize message; 
		 * nested exception is com.sun.xml.internal.messaging.saaj.SOAPExceptionImpl: Unable to internalize message
		 * Cannot create message: incorrect content-type for SOAP version. 
		 * Got: application/soap+xml; charset=UTF-8 Expected: text/xml
	 	 */
		messageFactory.setSoapVersion(SoapVersion.SOAP_12);
		return messageFactory;
	}

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan(marshallerPackage);
		return marshaller;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(
				messageFactory());
		webServiceTemplate.setMarshaller(marshaller());
		webServiceTemplate.setUnmarshaller(marshaller());
		webServiceTemplate.setMessageSender(messageSender());
		webServiceTemplate.setDefaultUri(serviceEndpoint);
		return webServiceTemplate;
	}

	@Bean
	public HttpComponentsMessageSender messageSender() {
		HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
		return httpComponentsMessageSender;
	}
}