package com.threaddemo;

public class Account extends Thread{
	
	static int balance=1000;
	
	public void run()
	{
		if(balance>800)
		{
			System.out.println(Thread.currentThread().getName() +"your balance is" + balance + " rupees u can withdraw the amount");
			
			try {
			sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
			balance=200;
			System.out.println(Thread.currentThread().getName() +"After withdrawal your balance is "+ balance);
	}
		else
		{
			System.out.println(Thread.currentThread().getName() +"your balance is "+ balance + "so you cant withdrawl the amount");
		}
		
	}
}

