package com.epam.hypermarket.tuningparameters;

public class Size {
    private double height;
    private double length;
    private double width;
    private float radius;

    public Size(){}

    public Size(double height,double length,double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Size(double height,double length,float radius){
        this.height = height;
        this.length = length;
        this.radius = radius;
    }

    public Size(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public float getRadius() {
        return radius;
    }
}