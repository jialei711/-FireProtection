package com.beautifulhomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ServletComponentScan
@EnableJpaRepositories(basePackages="com.beautifulhomes.platform.repository")
@EntityScan(basePackages="com.beautifulhomes.platform")
public class BeautifulhomesPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeautifulhomesPlatformApplication.class, args);
	}
	
}
