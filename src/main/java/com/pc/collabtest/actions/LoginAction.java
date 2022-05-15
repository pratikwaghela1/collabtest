package com.pc.collabtest.actions;

import java.util.Map;

import javax.validation.Valid;

import org.apache.struts2.dispatcher.SessionMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pc.collabtest.constant.AppConstant;
import com.pc.collabtest.model.Login;
import com.pc.collabtest.model.User;
import com.pc.collabtest.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Valid
	public Login login;
	
	@Autowired
	private LoginService loginService;
	
	
	
    public String loginForm() throws Exception {
		log.info("loginForm().........START");
		return "success";
	}
	
	public String login() throws Exception {
		log.info("login().........START");
		log.info("login - {}",login);
		User user = loginService.validateLogin(login);
		if(null != user ) {
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put(AppConstant.SESSION_USER, user);
			return "success";
		}
		addActionError("Invalid Username or Password");
		
		return "input";
	}

	
	
	public String logout() throws Exception {
		log.info("logout().........START");
		SessionMap<String, Object> session = (SessionMap) ActionContext.getContext().getSession();

		if(session != null) {
			log.info(".....................invalidate session.......................");
			session.invalidate();
		}
		
		return "loginForm";
	}
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
