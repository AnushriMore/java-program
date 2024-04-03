package com.threaddemo;

import java.util.LinkedHashSet;
// creating the thread class by extending thread class.
// Threadone is a Thread
class ThreadOne extends Thread
{
  @Override
  public void run()
  {
	  for(int i=1; i<5; i++)
	  {
		  System.out.println("value of i =" + i);
	  }
  }
}
class ThreadTwo extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Thraed Two =" + i);
		}
     }
}
public class ThreadInJava {

	public static void main(String[] args) {
		
		ThreadOne t1=new ThreadOne(); //new state
		ThreadOne t2=new ThreadOne();
		t1.start();                   //runnable 
		t2.start();
		System.out.println("mai main method hu");
		//t1.join();
	}

}
