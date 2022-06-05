package com.company;

public class Main {

    public static void main(String[] args) {
        XY xy = XY.getInstanse();
        xy.setX(4);
        xy.setY(5);
        xy.result();
        XY xy1 = XY.getInstanse();
        xy1.setX(3);
        xy1.result();
        if(xy.hashCode() == xy1.hashCode()){
            System.out.println("OK");
        }
        else{
            System.out.println("ERROR");
        }
    }
}
