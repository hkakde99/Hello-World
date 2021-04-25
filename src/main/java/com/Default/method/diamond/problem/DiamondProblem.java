package com.Default.method.diamond.problem;

import java.util.Comparator;


public class DiamondProblem implements A,B{
    	//way 1 : override
		@Override
		public void m1() { //to solve this diamond problem we need to override default method
			System.out.println("overriden implementation");
		}
		
		//way 2: use super keyword
		public void getParentMethod() {
			B.super.m1();
		}
		public static void main(String[] args) {
			DiamondProblem obj = new DiamondProblem();
			obj.m1();
			obj.getParentMethod();
		}

}
interface A{
	default void m1() {
		System.out.println("inside A");
	}
}

interface B{
	default void m1() {
		System.out.println("inside B");
	}
}
	

