package com.cg.loginAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ComCgLoginAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComCgLoginAuthenticationApplication.class, args);
		
	}

}
