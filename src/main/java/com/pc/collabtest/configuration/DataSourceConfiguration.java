package com.pc.collabtest.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Getter
@Configuration
public class DataSourceConfiguration {

	@Value("${mssql.url:jdbc:sqlserver://${mssql.dbserver:localhost}:${mssql.port:1501};DatabaseName=${mssql.dbname:${instance.name:collabtest}}}")
	private String url;

	@Value("${mssql.user:sa}")
	private String user;

	@Value("${mssql.password:Admin123}")
	private String password;

	@Value("${mssql.driver:com.microsoft.sqlserver.jdbc.SQLServerDriver}")
	private String driver;

	@Bean
	public DataSource flywayDataSource() {
		log.info("..............................................Initializing flywayDataSource START");
		HikariDataSource dataSource = DataSourceBuilder.create()
				.url(url)
				.username(user)
				.password(password)
				.driverClassName(driver).type(HikariDataSource.class).build();
		dataSource.setMaximumPoolSize(5);
		log.info("..............................................Initializing flywayDataSource END");
		return dataSource;
	}

	@Bean
	public DataSource appDataSource() {
		log.info("...............................................Initializing appDataSource START");
		HikariDataSource dataSource = DataSourceBuilder.create().url(url).username(user).password(password)
				.driverClassName(driver).type(HikariDataSource.class).build();
		dataSource.setMaximumPoolSize(5);
		log.info("...............................................Initializing appDataSource END");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		log.info("................................................Initializing jdbcTemplate START");
		log.info("................................................Initializing jdbcTemplate END");
		return new JdbcTemplate(appDataSource());
	}
}
