package com.pc.collabtest.configuration;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class CollWebConfiguration {

	
	
	

	@Bean
	public FilterRegistrationBean<StrutsPrepareAndExecuteFilter> filterRegistrationBean() {
		log.info("::::: filterRegistrationBean created ::::::");
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
		registrationBean.setFilter(struts);
		registrationBean.addUrlPatterns("*.action");
		registrationBean.setOrder(1);
		return registrationBean;
	}
	
	
	@Bean
	public ServletListenerRegistrationBean<CollSessionListener> sessionListenerWithMetrics() {
	   log.info("::::: sessionListenerWithMetrics created ::::::");
	   ServletListenerRegistrationBean<CollSessionListener> listenerRegBean =
	     new ServletListenerRegistrationBean<>();
	   listenerRegBean.setListener(new CollSessionListener());
	   return listenerRegBean;
	}
}
