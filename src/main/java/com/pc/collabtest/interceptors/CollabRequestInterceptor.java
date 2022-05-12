package com.pc.collabtest.interceptors;

import java.util.Map;

import org.apache.struts2.dispatcher.HttpParameters;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.ValueStack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollabRequestInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		Map<String,Object> session = invocation.getInvocationContext().getSession();
		
		HttpParameters httpParameters = invocation.getInvocationContext().getParameters();
		log.info("************************************************************ CollabRequestInterceptor START");
		for(String key : httpParameters.keySet()) {
			log.info("param before:  " + key + " - " + httpParameters.get(key));
		}
		log.info("session before:: " + session);
		
		String result = invocation.invoke();
		log.info("session after:: " + session);
		for(String key : httpParameters.keySet()) {
			log.info("param after:  " + key + " - " + httpParameters.get(key));
		}
		log.info("************************************************************ CollabRequestInterceptor END");
		return result;
	}

}
