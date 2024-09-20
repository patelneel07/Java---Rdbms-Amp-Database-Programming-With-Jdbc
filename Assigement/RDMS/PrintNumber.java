package com.Module;

	public class PrintNumber 
	{
	    public void printn(int number) 
	    {
	        System.out.println("Integer: " + number);
	    }

	    public void printn(double number) 
	    {
	        System.out.println("Double: " + number);
	    }

	    public void printn(float number) 
	    {
	        System.out.println("Float: " + number);
	    }

	    
	    public void printn(long number) 
	    {
	        System.out.println("Long: " + number);
	    }

	    public void printn(short number) 
	    {
	        System.out.println("Short: " + number);
	    }

	    public void printn(byte number) 
	    {
	        System.out.println("Byte: " + number);
	    }

	    public static void main(String[] args) 
	    {
	        PrintNumber printNumber = new PrintNumber();

	     
	        printNumber.printn(10);         
	        printNumber.printn(15.5);       
	        printNumber.printn(20.5f);      
	        printNumber.printn(100000L);    
	        printNumber.printn((short) 5);  
	        printNumber.printn((byte) 3);   
	    }
	}


