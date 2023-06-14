package edu.uqu.cs;
 
public class Triangle{
    private double base;
    private double height;
 
    // TODO: Define an empty constructor that sets all fields to 0.0
    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
 }
 
    // TODO: Define a non-empty constructor that takes a base and the hieght of a Triangle instance.
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
 
    // TODO: Define getters and setters as follows:
    // getBase() and setBase()
    public double getBase() {
        return this.base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    // getHeight() and setHeight()
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
 
   
    // TODO: Define a method called `getArea` that returns a value of the Triangle's area
    // Hint: Area = 0.5 * base * height
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

}