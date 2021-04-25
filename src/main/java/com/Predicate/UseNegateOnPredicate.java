package com.Predicate;

import java.util.function.Predicate;

public class UseNegateOnPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p1 = (num)->num>10;
		Predicate<Integer> p2 = (num)->num>30;
		
		System.out.println(p1.or(p2).test(15));
		System.out.println(p1.and(p2).test(15));
		System.out.println(p1.negate().test(98));
	}

}
