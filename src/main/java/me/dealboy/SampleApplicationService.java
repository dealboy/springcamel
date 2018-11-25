package me.dealboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camel-context02.xml")
public class SampleApplicationService {

	public static void main(String[] args) {
                SpringApplication.run(SampleApplicationService.class, args);
        
	}

    }