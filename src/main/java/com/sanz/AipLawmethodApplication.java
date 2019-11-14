package com.sanz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@EnableAutoConfiguration
@MapperScan("com.sanz.workbench.dao")
@ImportResource("classpath:mapper/*")
@ComponentScan(basePackages = "com.sanz")
@SpringBootApplication
public class AipLawmethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AipLawmethodApplication.class, args);
	}

}
