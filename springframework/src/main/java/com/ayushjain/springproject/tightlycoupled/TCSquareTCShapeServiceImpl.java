package com.ayushjain.springproject.tightlycoupled;

public class TCSquareTCShapeServiceImpl implements TCShapeService {

    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }
}
