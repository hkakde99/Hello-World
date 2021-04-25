package sorting.java8.way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingStreamApi {
	
	public static void main(String[] args) {
		List<Emp1> data = new ArrayList<Emp1>();
		data.add(new Emp1(101, "AAA"));
		data.add(new Emp1(76, "BAA"));
		data.add(new Emp1(76, "BAA"));
		data.add(new Emp1(122, "AAA"));
		data.add(new Emp1(122, "AAA"));
		Emp1 e = new Emp1(76, "DAA");
		data.add(e);
		data.add(e);
		
		System.out.println("Before Unique id and name :"+data);
		
		Set<Emp1> dataUnique = new HashSet(data);
		System.out.println("Unique After All id +name:"+dataUnique);
		HashMap<Integer, String> uni = new HashMap<>();
		Set<Integer> uniqueIds = new HashSet<>();
		Iterator<Emp1> el = dataUnique.iterator();
		while(el.hasNext()) {
			Emp1 element = el.next();
			uni.put(element.getEmpId(), element.getEmpName());
			
		}
		
		
		System.out.println("Unique After Final code :"+uni);
		System.exit(0);
		
		
		List<Emp1> result = data.stream().sorted((o1,o2)->o1.getEmpName().compareTo(o2.getEmpName()))
				                                          .collect(Collectors.toList());
		System.out.println(result);
		
		
		List<Integer> digits = new ArrayList<>();
		digits.add(32);digits.add(53);digits.add(87);digits.add(11);
		//natural sorting 
		List<Integer> result1 = digits.stream().sorted().collect(Collectors.toList());
		System.out.println(result1);
	}

}
class Emp1{
	private Integer empId;
	private String empName;
	
	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + "]";
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Emp1(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		
//		return this.empId.hashCode()+this.empName.hashCode();
		return this.empName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Emp1 e = (Emp1)obj;
//		return this.empId==e.getEmpId()&&e.getEmpName().equals(this.empName);
		return e.getEmpName().equals(this.empName);
	}
	
	
}

