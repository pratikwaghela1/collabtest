package com.pc.collabtest.configuration;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class FlywayConfiguration {

	private DataSource flywayDataSource;

	public void startMigration() {
		log.info("...................................................Flyway Migration START");
		ClassicConfiguration classicConfiguration = new ClassicConfiguration();
		classicConfiguration.setDataSource(flywayDataSource);
		classicConfiguration.setOutOfOrder(true);
		classicConfiguration.setEncodingAsString("UTF-8");

		Flyway flyway = new Flyway(classicConfiguration);
		flyway.migrate();
		log.info("...................................................Flyway Migration END");
	}
}
