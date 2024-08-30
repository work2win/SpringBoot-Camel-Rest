package com.work2win.config;



import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class ApiCamelRouteBuilder extends RouteBuilder{
	
	private static final Logger LOG = LoggerFactory.getLogger(ApiCamelRouteBuilder.class);
	
	@Override
    public void configure() throws Exception {
		
		restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		LOG.info("Initialized the component that provide REST services");
		
		
			
	}

}
