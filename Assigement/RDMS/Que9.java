package com.Module;

class Triangle 
{
    private double side1;
    private double side2;
    private double side3;

    
    public Triangle() 
    {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public double calculateArea() 
    {
        double s = (side1 + side2 + side3) / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double calculatePerimeter() 
    {
        return side1 + side2 + side3;
    }

    public void printDetails() 
    {
        System.out.println("Area of Triangle: " + calculateArea());
        System.out.println("Perimeter of Triangle: " + calculatePerimeter());
    }
}

public class Que9 
{
	public static void main(String[] args) 
	{
        
        Triangle triangle = new Triangle();
        triangle.printDetails(); 
    }
}
