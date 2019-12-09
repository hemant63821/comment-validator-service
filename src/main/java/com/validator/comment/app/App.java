package com.validator.comment.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.validator.comment.applicationConfig.ApplicationConfig;

public class App {
	public static void main( String[] args )
    {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		context.close();
    }
}
