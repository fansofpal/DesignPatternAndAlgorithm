package com.hdw.facade;

/**
 * user:hudawei1
 * date:2018/2/8
 * time:18:06
 */
public class FacadePainter {
    private CirclePainter circlePainter;
    private SquarePainter squarePainter;

    public FacadePainter(){
        circlePainter = new CirclePainter();
        squarePainter = new SquarePainter();
    }

    public String circleDrawing(){
        return circlePainter.drawing();
    }

    public String squareDrawing(){
        return squarePainter.drawing();
    }

}
