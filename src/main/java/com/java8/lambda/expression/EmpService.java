package com.java8.lambda.expression;

@FunctionalInterface
public interface EmpService {
	
	public void addEmpId(int id);

}


//this is annonymous class and see the difference between lambdaExp and anonymous class or anonymous inner class
class Body{
	EmpService obj = new EmpService() {
		@Override
		public void addEmpId(int id) {
			
		}
		
	};
}
