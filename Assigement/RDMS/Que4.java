package com.Module;

public class Que4 
{
	    public static void main(String[] args) 
	    {
	        String string1 = "Java Exercises";
	        String string2 = "se";
	        String string3 = "Java Exercise";
	        
	       
	        boolean endsWithString2 = string1.endsWith(string2);
	        System.out.println("\"" + string1 + "\" ends with \"" + string2 + "\"? " + endsWithString2);
	        
	       
	        boolean endsWithString3 = string3.endsWith(string2);
	        System.out.println("\"" + string3 + "\" ends with \"" + string2 + "\"? " + endsWithString3);
	    }
	

}
