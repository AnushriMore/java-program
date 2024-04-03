package com.demo;

public class ExceptionDemo4
{
	public static void main(String[] args) {
        int a = 30, b = 0; 
        try
        {
        	int c = a/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        }
        catch(ArithmeticException ae)
        {
        	System.out.println("divide by 0 is not possible");
        }


	}
}

