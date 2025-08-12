package com.nivedecoder.ecommerce_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcommerceServicesApplication {

@GetMapping("/trialMethod")
	public String trail(){
		return "Trial Method";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceServicesApplication.class, args);
	}

}
//echo "# Retail-website" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/nive1991/Retail-website.git
//		git push -u origin main