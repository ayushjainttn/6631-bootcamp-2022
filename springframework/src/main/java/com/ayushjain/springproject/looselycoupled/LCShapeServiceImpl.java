package com.ayushjain.springproject.looselycoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LCShapeServiceImpl {

    @Autowired
    LCShapeService shape;

    LCShapeServiceImpl(LCShapeService shape){
        this.shape = shape;
    }
    public int calculateArea(int length, int breadth){
        int area = shape.area(length, breadth);
        return area;
    }
}
