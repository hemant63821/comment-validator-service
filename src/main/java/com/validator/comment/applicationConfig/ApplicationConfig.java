package com.validator.comment.applicationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@SuppressWarnings("deprecation")
public class ApplicationConfig {
	 @Bean
	    public MongoDbFactory mongoDbFactory() throws Exception {
	        MongoClient mongoClient = new MongoClient("localhost", 27017);
//	        UserCredentials userCredentials = new UserCredentials("", "");
	        return new SimpleMongoDbFactory(mongoClient, null);
	    }
	 
	    @Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	        return mongoTemplate;
	    }
}
