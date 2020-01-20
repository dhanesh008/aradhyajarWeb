package com.example.demo.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.bytebuddy.asm.Advice.Return;

@Configuration
public class WebConfig {

	@Bean
	public Mapper Mapper()
	{
	Mapper mapper=new DozerBeanMapper();
	return mapper;
	}
}
