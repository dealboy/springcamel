package me.dealboy;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


public class FileSample extends RouteBuilder {
    
    @Override
	public void configure() throws Exception { 
        from("file:C://input?noop=true")
            .to("file:C://output")
                .transform().simple(".......... File")
            .to("stream:out");
    }
    
}