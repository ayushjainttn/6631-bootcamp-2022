package com.ayushjain.springproject.tightlycoupled;

public class TCRectangleTCShapeServiceImpl implements TCShapeService {
    
    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }
}
