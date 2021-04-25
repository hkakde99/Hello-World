package sorting.java8.way;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingLambda {
	public static void main(String[] args) {
		List<Emp> data = new ArrayList<Emp>();
		data.add(new Emp(101, "AAA"));
		data.add(new Emp(42, "BAA"));
		data.add(new Emp(122, "CAA"));
		data.add(new Emp(76, "DAA"));
		
		//sorting by name in asc order
		Comparator<Emp> sortByIdAsc = (o1,o2)->{return o1.getEmpId()-o2.getEmpId();};
		Collections.sort(data,sortByIdAsc);
		System.out.println(data);
		
		//sorting by id in desc order
		Comparator<Emp> sortByIdDesc = (o1,o2)->{return -(o1.getEmpId()-o2.getEmpId());};
		Collections.sort(data,sortByIdDesc);
		System.out.println(data);
		
		//sorting by name
		Collections.sort(data, (o1,o2)->o1.getEmpName().compareTo(o2.getEmpName()));
		System.out.println(data);
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

