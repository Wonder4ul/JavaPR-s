package iss1;

public class Rectangle {
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){}
    public Rectangle(double width, double length, String color, boolean filled){}
    public double getWidth(){return width;}
    public void setWidth(){}

    public double getLength() {
        return length;
    }
    public void setLength(double length){}
    public double getArea(){}
    public double getPerimeter(){}
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
