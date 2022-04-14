//package com.pc.collabtest.configuration;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.web.ServerProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//@EnableConfigurationProperties({TomcatProperties.class, ServerProperties.class})
//@Component
//public class Startup implements ServletContextListener
//{
//	
//	@Autowired
//	@Qualifier("flywayDataSource")
//	private DataSource flywayDataSource;
//	
//	@Override
//	public void contextInitialized(ServletContextEvent event)
//	{
//		FlywayConfiguration flywayConfiguration = new FlywayConfiguration(flywayDataSource);
//		flywayConfiguration.startMigration();
//		
//		
//	}
//	
//	
//	
//
//}