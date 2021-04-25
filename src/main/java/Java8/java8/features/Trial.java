package Java8.java8.features;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Trial {

	public static void main(String[] args) {
		Set<Integer> setData = new HashSet<Integer>();
		setData.add(2);
		setData.add(72);
		setData.add(53);
		setData.add(8731);
		setData.add(1);
		setData.add(423);
		setData.add(54);
		
		
		System.out.println(setData);
		
		Set<Integer> treeData = new TreeSet<Integer>(setData);
		System.out.println(treeData);
	} 
}
