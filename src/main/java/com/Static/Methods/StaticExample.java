package com.Static.Methods;


public class StaticExample {

}
interface S{
	public static void m1() {
		System.out.println("inside S");
	}
}
interface J{
	public static void m1() {
		System.out.println("inside J");
	}
}
class Demo implements S,J{
	public static void main(String[] args) {
		S.m1();
		J.m1();
		
	}
}