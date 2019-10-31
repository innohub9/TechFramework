package com.boa.kyc.KYCApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages="com.boa.kyc.*")
@EnableJpaRepositories(basePackages="com.boa.kyc.*") 
@EntityScan(basePackages="com.boa.kyc.*")

public class KycAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycAppApplication.class, args);
	}

}

