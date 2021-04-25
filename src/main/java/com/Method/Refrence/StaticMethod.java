package com.Method.Refrence;

public class StaticMethod {
	public static void m1() {
		System.out.println("inside static m1");
	}
	
	
	public static void main(String[] args) {
		Runnable r1 = StaticMethod::m1; //way1
		Runnable r2 = ()->m1();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		
	}

}
