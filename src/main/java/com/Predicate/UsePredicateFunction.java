package com.Predicate;

import java.util.function.Predicate;

//using predicate function check value of i is > 10 or not
public class UsePredicateFunction {
	static Predicate<Integer> ref = (Integer num)->num>25&&num<100;
	
	public static void main(String[] args) {
		
		testNo(45);
		
	}
	public static void testNo(int n) {
		boolean result = ref.test(n);
		if(result==true) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Fail");
		}
	}
}
