package com.Module;

public class Que3 
{
	 public static void main(String[] args) 
	 {
	        String string1 = "topsint.com";
	        String string2 = "topsint.com";
	        String string3 = "Topsint.com";
	        
	        
	        boolean isEqual1 = string1.equals(string2);
	        System.out.println("Comparing " + string1 + " and " + string2 + ": " + isEqual1);
	        
	        
	        boolean isEqual2 = string2.equals(string3);
	        System.out.println("Comparing " + string2 + " and " + string3 + ": " + isEqual2);
	   }

}
