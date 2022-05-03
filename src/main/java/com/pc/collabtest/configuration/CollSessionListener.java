package com.pc.collabtest.configuration;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollSessionListener implements HttpSessionListener {

	private final AtomicInteger activeSessions;

	public CollSessionListener() {
		super();
		activeSessions = new AtomicInteger();
	}
	
	 public int getTotalActiveSession() {
	        return activeSessions.get();
	    }

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// Implement logic to save last visited page to database...
		log.info("sessionDestroyed ::::::"+activeSessions.get());
		activeSessions.decrementAndGet();
		log.info("sessionDestroyed ::::::"+activeSessions.get());
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		log.info("sessionCreated ::::::"+activeSessions.get());
		activeSessions.incrementAndGet();
		log.info("sessionCreated ::::::"+activeSessions.get());
	}

}
