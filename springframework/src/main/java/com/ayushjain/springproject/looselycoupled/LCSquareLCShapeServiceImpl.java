package com.ayushjain.springproject.looselycoupled;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LCSquareLCShapeServiceImpl implements LCShapeService {

    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }
}
