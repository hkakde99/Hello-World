package com.copy.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class UsingStream {
	
	public static void main(String[] args) {
		List<Emp> data = new ArrayList<Emp>();
		data.add(new Emp(101, "AAA"));
		data.add(new Emp(42, "BAA"));
		data.add(new Emp(122, "CAA"));
		data.add(new Emp(76, "DAA"));
		
		Object[] copy = data.stream().toArray(Object[]::new);
		Stream<Integer> ref = Stream.of(192,42,32,45);
		
		data.forEach(System.out::println);
		
	}

}
class Emp{
	private int empId;
	private String empName;
	
	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

