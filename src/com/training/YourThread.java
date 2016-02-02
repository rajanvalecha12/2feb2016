package com.training;

public class YourThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	for(int i=0;i<=10;i++){
System.out.println(calculate());
	}
	}
	static double i=100;
	public double calculate(){
		
		return ++i;
	}

}
