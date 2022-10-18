package com.ayushjain.springproject;

import com.ayushjain.springproject.looselycoupled.LCShapeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
		LCShapeServiceImpl shapeService = applicationContext.getBean(LCShapeServiceImpl.class);
		int area = shapeService.calculateArea(3, 3);		System.out.println(area);

	}

}
