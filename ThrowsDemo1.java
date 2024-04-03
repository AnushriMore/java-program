package com.demo;
//propogation of exception handling
//throw 
//throws
import java.io.IOException;
public class ThrowsDemo1 
{
	void method1() throws IOException 
	{
		throw new IOException("Some hardware problem");
	}
	void method2() throws IOException
	{
		method1();
	}
	void method3() throws IOException
	{
		method2();
	}
	public static void main(String[] args)  {
		
		ThrowsDemo1 td=new ThrowsDemo1();
		try {
			td.method3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Main methid ne handle kiya exception ko");
		}
		System.out.println("bacha hua code exceute hoga");
	}

}




