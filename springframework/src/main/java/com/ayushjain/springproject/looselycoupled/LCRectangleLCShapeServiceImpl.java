package com.ayushjain.springproject.looselycoupled;

import org.springframework.stereotype.Component;

@Component
public class LCRectangleLCShapeServiceImpl implements LCShapeService {
    
    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }
}
