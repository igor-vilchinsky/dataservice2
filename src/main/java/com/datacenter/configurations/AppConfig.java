package com.datacenter.configurations;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@Configuration
public class AppConfig {
	
	@Value("${driver.class}")
	private String driverClass;
	
	@Value("${datasource.url}")
	private String dataSourceUrl;
	
	@Value("${datasource.username}")
	private String dataSourceUserName;
	
	@Value("${datasource.password}")
	private String dataSourcePassword;
	
	@Value("classpath:h2/initial-query.sql")
	private Resource dataScript;
	
	@Autowired
	private DataSource dataSource;
	
	/*@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(dataSourceUrl);
		dataSource.setUsername(dataSourceUserName);
		dataSource.setPassword(dataSourcePassword);
		return dataSource;
	}*/
	
	@Bean
	public DataSourceInitializer dataSourceInitializer(final DataSource dataSource) {
	    final DataSourceInitializer initializer = new DataSourceInitializer();
	    initializer.setDataSource(dataSource);
	    initializer.setDatabasePopulator(databasePopulator());
	    return initializer;
	}

	private DatabasePopulator databasePopulator() {
	    final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	    populator.addScript(dataScript);
	    return populator;
	}

}
