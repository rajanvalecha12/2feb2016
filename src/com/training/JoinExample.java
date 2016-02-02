package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		Thread t = new Thread(){

			@Override
			public void run() {
			System.out.println("Reading");
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finished reading");
			}
			
		};
		t.start();
		System.out.println("staring");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main finished");
	}

}
