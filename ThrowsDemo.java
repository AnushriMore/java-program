package com.demo;

public class ThrowsDemo 
{
	void validate(int age)throws ArithmeticException
	{
		if(age<18)
		throw new ArithmeticException("age is not valid"); //throw instance of class (ArithemeticException)
		else
			System.out.println("ur are eligible for voting");
	}
	public static void main(String[] args) {
		ThrowDemo td=new ThrowDemo();
		try
		{
			td.validate(13);
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("welcome for voting");
		}
		System.out.println("me bhi exceute ho raha hu");

	}

}




