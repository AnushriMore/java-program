package com.threaddemo;

public class MainThreadDemo {

	public static void main(String[] args) 
	{
	 Thread t=Thread.currentThread();
	 t.setName("i am main Thread");
	 System.out.println(t.getName());
	 
	 Thread.currentThread().setName("mai main hu");
	 System.out.println(Thread.currentThread().getName());

	}

}
