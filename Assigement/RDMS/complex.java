package com.Module;

import java.util.Scanner;

class complex 
{
    private double real;
    private double imaginary;

    public complex(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public complex add(complex other) 
    {
        return new complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public complex subtract(complex other) 
    {
        return new complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public complex multiply(complex other) 
    {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new complex(realPart, imaginaryPart);
    }
    
    public void display() 
    {
        if (imaginary >= 0) 
        {
            System.out.println(real + " + " + imaginary + "i");
        } 
        else
        {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        complex complex1 = new complex(real1, imaginary1);

        
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        complex complex2 = new complex(real2, imaginary2);

        
        complex sum = complex1.add(complex2);
        complex difference = complex1.subtract(complex2);
        complex product = complex1.multiply(complex2);

        
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        difference.display();
        System.out.print("Product: ");
        product.display();

        scanner.close();
    }
}
