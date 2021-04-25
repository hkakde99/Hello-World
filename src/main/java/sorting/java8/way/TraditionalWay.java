package sorting.java8.way;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//using annonymous class
public class TraditionalWay {

	public static void main(String[] args) {
		List<Employee> data = new ArrayList<>();
		data.add(new Employee(101, "AAA"));
		data.add(new Employee(42, "BAA"));
		data.add(new Employee(122, "CAA"));
		data.add(new Employee(76, "DAA"));
		
		Comparator<Employee> sortById = new Comparator<Employee>() {	
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId()-o2.getEmpId();
			}
		};
		
		Comparator<Employee> sortByName = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		};
		
		Collections.sort(data,sortById);
		System.out.println(data);
		Collections.sort(data,sortByName);
		System.out.println(data);

	}

}
class Employee{
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
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
