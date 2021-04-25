package com.Method.Refrence;

public class InstanceMethod {
	
	public static void main(String[] args) {
		A a = new A();
		Runnable r = a::m1;
		Thread t = new Thread(r);
		t.start();
	}

}
class A{
	public void m1() {
		System.out.println("inside instance m1");
	}
}
