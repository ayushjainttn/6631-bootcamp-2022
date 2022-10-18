package com.ayushjain.springproject.tightlycoupled;

public class TightlyCoupled {

	public static void main(String[] args) {

		TCShapeServiceImpl shape = new TCShapeServiceImpl();
		int areaCalculated = shape.calculateArea(3, 3);
		System.out.println(areaCalculated);
		//SpringApplication.run(Main.class, args);
	}

}
