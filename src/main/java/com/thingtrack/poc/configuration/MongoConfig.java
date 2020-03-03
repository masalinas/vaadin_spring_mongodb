package com.thingtrack.poc.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoClientConfiguration {
	@Value("${mongo.database}")
    private String databaseName;

    @Value("${mongo.host}")
    private String host;

    @Value("${mongo.port}")
    private int port;
    
    @Value("${mongo.username}")
    private String username;
    
    @Value("${mongo.password}")
    private String password;

    @Override
    protected String getDatabaseName() {
        return databaseName;
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.thingtrack.poc";
    }

	@Override
	public MongoClient mongoClient() {
		String connectionString = "mongodb://" + username + ":" + password + "@" + host + ":" + port + "/?authSource=" + databaseName;
		
		return MongoClients.create(connectionString);
	}

}
