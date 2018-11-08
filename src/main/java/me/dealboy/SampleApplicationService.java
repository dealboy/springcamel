package me.dealboy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SampleApplicationService {

	public static void main(String[] args) {
                SpringApplication.run(SampleApplicationService.class, args);
        
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("camel-context.xml");
        // Keep main thread alive for some time to let application finish processing the input files.
        //Thread.sleep(5000);
        //applicationContext.close();
	}

    }