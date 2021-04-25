package com.java8.lambda.expression;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImpl {
	
	
	public static void main(String[] args) {
		List<Integer> empIds = new ArrayList<>();
		EmpService ser = (int id) -> {empIds.add(id);System.out.println("Emp Id added :"+ id);	};
							
		ser.addEmpId(743);
	}
}

