package com.vit.spring.mvc.court.config;

import java.util.List;
import java.util.Properties;

import com.vit.spring.mvc.court.exceptions.ReservationNotAvailableException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

//@Configuration
public class ExceptionResolverConfiguration /* implements WebMvcConfigurer */{
	
	//@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		resolvers.add(handlerExceptionResolver());
	}
	
	//@Bean
	public HandlerExceptionResolver handlerExceptionResolver() {
		Properties exceptionMappings = new Properties();
		exceptionMappings.setProperty(ReservationNotAvailableException.class.getName(), "rservatioNotFound");
		
		SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
		simpleMappingExceptionResolver.setExceptionMappings(exceptionMappings);
		//simpleMappingExceptionResolver.setDefaultErrorView("error");
		return simpleMappingExceptionResolver;
	}
	
	

}
