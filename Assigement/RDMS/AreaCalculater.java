package com.Module;

public class AreaCalculator
{

    
    public void printArea(double side)
    {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }

    
    public void printArea(double length, double breadth) 
    {
        double area = length * breadth; 
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) 
    {
        AreaCalculator calculator = new AreaCalculator();


        calculator.printArea(5.0); 


        calculator.printArea(4.0, 6.0); 
    }
}

	