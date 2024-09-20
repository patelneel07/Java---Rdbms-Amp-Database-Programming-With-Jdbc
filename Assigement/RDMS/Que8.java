package com.Module;

class Parent
{
    public void display() 
    {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent 
{
    public void displayChild() 
    {
        System.out.println("This is a child class");
    }
}
public class Que8
{
    public static void main(String[] args) 
    {
        
        Parent parent = new Parent();
        parent.display();

        
        Child child = new Child();
        child.displayChild();

        
        child.display();
    }
}

