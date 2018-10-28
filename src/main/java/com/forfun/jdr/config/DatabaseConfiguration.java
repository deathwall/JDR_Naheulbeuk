package com.forfun.jdr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.forfun.jdr.*")
@PropertySource(value = "classpath:application.properties")
public class DatabaseConfiguration extends AbstractMongoConfiguration {

	@Value("${spring.data.mongodb.host}")
	private String mongoDbHost;

	@Value("${spring.data.mongodb.port}")
	private int mongoDbPort;

	@Value("${spring.data.mongodb.database}")
	private String mongoDbDatabase;

	@Override
	protected String getDatabaseName() {
	    return mongoDbDatabase;
	}

	@Bean
	@Override
	public MongoClient mongoClient() {
		return new MongoClient(mongoDbHost, mongoDbPort);
	}
}
