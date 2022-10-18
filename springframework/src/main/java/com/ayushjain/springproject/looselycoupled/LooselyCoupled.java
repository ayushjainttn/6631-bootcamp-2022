package com.ayushjain.springproject.looselycoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class LooselyCoupled {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(LooselyCoupled.class, args);
		LCShapeServiceImpl shapeService = applicationContext.getBean(LCShapeServiceImpl.class);
		//LCShapeServiceImpl shapeService1 = new LCShapeServiceImpl(new LCRectangleLCShapeServiceImpl());
		int area = shapeService.calculateArea(3, 3);
		System.out.println(area);
	}

}
