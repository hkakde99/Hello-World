package com.Function;

import java.util.function.Function;

public class FunctionToConvertIntToString {
	
	public static void main(String[] args) {
		Function<Integer,String> intToString = (num)->num.toString();
		
		System.out.println(intToString.apply(87));
		
		Function<String,Integer> stringToInteger = (s)->Integer.parseInt(s);
		System.out.println(stringToInteger.apply("765"));
	}

}
