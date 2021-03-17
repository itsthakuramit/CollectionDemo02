package com.stackroute.mar17demo02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void demo() {
		
		
//		Map<String,String> newEmployee = new HashMap<>();
//		Map<String,String> newEmployee = new LinkedHashMap<>();
		Map<String,String> newEmployee = new TreeMap<>();

		newEmployee.put("empid", "e001");
		newEmployee.put("empname", "Sam");
		newEmployee.put("empsalary", "75000");
		newEmployee.put("emploc", "Mumbai");
		
	
//		for(Map.Entry<String, String> entry: newEmployee.entrySet()) {
//			System.out.println(entry.getKey()+ "  "+entry.getValue());
//		}
//		
//		
//		for(String key: newEmployee.keySet()) {
		
//			System.out.println(key);
//		}
//		
//		for(String values: newEmployee.values()) {
//			System.out.println(values);
//		}
//		
//		System.out.println(newEmployee.get("emploc"));
//		
		
		Iterator<Map.Entry<String,String>> itr = newEmployee.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> emp = itr.next();
			System.out.println(emp.getKey()+ " "+emp.getValue());
		}
		
		newEmployee.forEach((key,value) -> System.out.println(key+" "+value));
		
	}
	
}
