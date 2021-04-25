package com.java8.annonymous;

public class EmpServiceImpl {
//way 1 implementation
	EmpService getIdForDelete = new EmpService() {
		
		@Override
		public void empId(int id) {
			//here this impl and logic for delete employee
			
		}
	};
	
//way 1 second implementation	
	EmpService getIdForGet = new EmpService() {
		
		@Override
		public void empId(int id) {
			//here this impl and logic for get employee
			
		}
	};
	
//way 2 (how to replace way 1) 	
//replacing annonymous class by lambda expression		
		EmpService getIdForGetReplaceByLambda = (int id) -> {//here this impl and logic for get employee
		                  };
		                  
		public static void main(String[] args) {
			EmpServiceImpl obj = new EmpServiceImpl();
			obj.getIdForGetReplaceByLambda.empId(76);
			
		}

}

//way 0 normal implementation which can be replace by way 1 and way 2
class NormalwayImpl implements EmpService{

	@Override
	public void empId(int id) {
		//here is logic to use upcoming id
		
	}
	
	public static void main(String[] args) {
		NormalwayImpl obj = new NormalwayImpl();
		obj.empId(94);
	}
}

