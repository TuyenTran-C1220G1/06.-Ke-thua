package com.company.circle;


public class Cylinder extends Circle {
    private double height = 5.0;

    Cylinder() {

    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * this.getHeight();
    }

    @Override
    public String toString() {
        return "a Cylinder with height ="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
