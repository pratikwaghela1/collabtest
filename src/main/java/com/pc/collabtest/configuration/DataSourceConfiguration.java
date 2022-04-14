package com.pc.collabtest.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
@Getter
public class DataSourceConfiguration {

	@Value("${mssql.url:jdbc:sqlserver://${mssql.dbserver:localhost}:${mssql.port:1433};DatabaseName=${mssql.dbname:${instance.name:collabtest}}}")
	private String url;

	@Value("${mssql.user:sa}")
	private String user;

	@Value("${mssql.password:Admin123}")
	private String password;

	@Value("${mssql.driver:com.microsoft.sqlserver.jdbc.SQLServerDriver}")
	private String driver;

	@Bean
	public DataSource flywayDataSource() {

		HikariDataSource dataSource = DataSourceBuilder.create().url(url).username(user).password(password)
				.driverClassName(driver).type(HikariDataSource.class).build();

		dataSource.setMaximumPoolSize(5);

		return dataSource;
	}
	
	
	@Bean
	public DataSource DataSource() {

		HikariDataSource dataSource = DataSourceBuilder.create().url(url).username(user).password(password)
				.driverClassName(driver).type(HikariDataSource.class).build();

		dataSource.setMaximumPoolSize(5);

		return dataSource;
	}

}
