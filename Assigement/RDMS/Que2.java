package com.Module;


public class Que2 {
    public static void main(String[] args) {
        String string1 = "Hello, ";
        String string2 = "World!";
        
        // Concatenate using the + operator
        String result1 = string1 + string2;
        System.out.println("Concatenated using + : " + result1);
        
        // Concatenate using the concat() method
        String result2 = string1.concat(string2);
        System.out.println("Concatenated using concat(): " + result2);
    }
}

