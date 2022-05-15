package com.pc.collabtest.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.pc.collabtest.constant.AppConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthenticatorInterceptor extends AbstractInterceptor {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		log.info(".......................AuthenticatorInterceptor()..........................");
		
		log.info("Action Name - {}", ActionContext.getContext().getName());
		
		Map<String,Object> session = ActionContext.getContext().getSession();
		
	    if(null != session.get(AppConstant.SESSION_USER)) {
	    	return invocation.invoke();
	    }
		
		return "loginForm";
	}

}
