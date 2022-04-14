//package com.pc.collabtest.configuration;
//
//import javax.sql.DataSource;
//
//import org.flywaydb.core.Flyway;
//import org.flywaydb.core.api.configuration.ClassicConfiguration;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@AllArgsConstructor
//public class FlywayConfiguration {
//
//	private DataSource dataSource;
//
//	public void startMigration() {
//		log.info("Flyway Migration Start................");
//		ClassicConfiguration classicConfiguration = new ClassicConfiguration();
//		classicConfiguration.setDataSource(dataSource);
//		classicConfiguration.setOutOfOrder(true);
//		classicConfiguration.setEncodingAsString("UTF-8");
//
//		Flyway flyway = new Flyway(classicConfiguration);
//		flyway.migrate();
//		log.info("Flyway Migration End................");
//	}
//}
