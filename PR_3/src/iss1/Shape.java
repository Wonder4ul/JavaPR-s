package iss1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){}
    public String getColor(){return color;}
    public void setColor(String color){}
    public boolean isFilled(){return true;}
    public void setFilled(boolean filled){}
    public double getArea(){}
    public double getPerimeter(){}
    public String toString(){}
}
