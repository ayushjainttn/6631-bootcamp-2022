package com.ayushjain.springproject.tightlycoupled;

public class TCShapeServiceImpl {
    public int calculateArea(int length, int breadth){
        TCShapeService shape = new TCSquareTCShapeServiceImpl();
        int area = shape.area(length, breadth);
        return area;
    }
}
