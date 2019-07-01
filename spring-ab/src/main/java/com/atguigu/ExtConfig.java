package com.atguigu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.atguigu")
@Configuration
public class ExtConfig  {
	
	@Bean
	public Blue blue(){
		return new Blue();
	}

}

