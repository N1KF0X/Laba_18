package com.company;

public class XY {
    private static XY xy = new XY();

    protected static double х;
    protected static double y;

    private XY(){

    }

    public void result(){
        System.out.println(2 * х + 3/y);
    }

    public static XY getInstanse(){
        return xy;
    }

    public void setX(double x) {
        this.х = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
