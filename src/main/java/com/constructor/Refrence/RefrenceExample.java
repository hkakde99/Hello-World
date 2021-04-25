package com.constructor.Refrence;

public class RefrenceExample {
	
	public static void main(String[] args) {
		//Way 1:
//		Service ref = (s)-> new Sample(s);
//		ref.get("Hi Man");
		
		//Way 2:
		Service ref = Sample::new;
		ref.get("Hi Man");
	}

}
interface Service{
	Sample get(String s);
}
class Sample{
	String s;
	public Sample(String s){
		this.s=s;
		System.out.println("Constructor called : "+s);
	}
}

