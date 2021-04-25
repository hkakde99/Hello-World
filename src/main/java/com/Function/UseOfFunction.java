package com.Function;

import java.util.function.Function;

public class UseOfFunction {
	
	public static void main(String[] args) {
		Function<String,Integer> f = (name)-> name.length();
		
		Integer result = f.apply("kakde");
		System.out.println(result);
	}

}
