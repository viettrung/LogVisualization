package com.fu.logVisualization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
