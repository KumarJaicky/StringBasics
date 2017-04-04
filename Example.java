package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example extends Thread {
	
	public static void main(String[] args){
		/*Thread t1= new Thread();
		Thread t2 = new Thread();
		t1.run();
		String s1= "ABC";
		String s2= new String("ABC");*/
		
		//System.out.println(s1.equals(s2));
		
		/*
		Set<String> students = new TreeSet();
		students.add("Rahul");
		students.add("Soham");
		students.add("Sohan");
		students.add("Mohan");
		students.getClass();
		
		students.toString();
		
		
		System.out.println(students);
		Iterator<String> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		for(String stu : students){
			
			students.getClass("")
			
		}
		
		List<String> Employee = new ArrayList<>();
		Employee.add("abs");
		Employee.add("hu");
		Employee.add("tu");
		
		System.out.println(Employee.size());
		System.out.println(Employee.get(0));
		
		
		LinkedList<Integer> link = new LinkedList<>();
		link.addFirst(123);
		
		link.add(342);
		link.addLast(432);
		link.add(234);
		System.out.println(link);
		
		link.removeFirst();
		System.out.println(link);*/
		
		
//		Hashtable<String, String> Animals = new Hashtable<>();
//		Animals.put(null,"A");
//		Animals.put("ass","A");
		
		
		//System.out.println(Animals);
		
		
		
		Map<Integer, String> employeeM = new TreeMap<>();
		employeeM.put(123, "jai");
		employeeM.put(446, "dhi");
		employeeM.put(567, "har");
		System.out.println(employeeM.entrySet());
		System.out.println(employeeM.keySet());
		////System.out.println(employeeM.get(123));
		//System.out.println(employeeM.values());
		//System.out.println(employeeM.values());
		
		Set<Entry<Integer, String>> list = employeeM.entrySet();
		//Iterator<E>
		
		for(Entry entry : list){
			System.out.println("key--" + entry.getKey() + "value===" + entry.getValue());
		}
	
		
		
	}

}
