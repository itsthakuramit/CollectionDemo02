package com.stackroute.mar17demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void arraylistdemo() {
		
		List<String> carList = new ArrayList<>();
		carList.add("Zen");
		carList.add("i10");
		carList.add("Swift");
		carList.add("Benz");
		
		
		for(String car:carList) {
			System.out.print(car);
		}
		System.out.println("");
		// To sort the list
		Collections.sort(carList);
		

		for(int index=0;index < carList.size();index++) {
			System.out.println(carList.get(index));
		}
		
	}
	
	public static void linkedlistdemo() {
		
		List<String> carList = new LinkedList<>();
		carList.add("IN-Zen");
		carList.add("KR-i10");
		carList.add("IN-Swift");
		carList.add("GE-Benz");
		carList.add("IN-Zen");
		carList.add("US-Ford");
		
		for(String car:carList) {
	//		System.out.println(car);
		}
		System.out.println("======");
		// To sort the list
		Collections.sort(carList);
		

		for(int index=0;index < carList.size();index++) {
			//System.out.println(carList.get(index));
		}
		
		//System.out.println(carList.isEmpty());
		
		if(carList.contains("Zen")) {
			//System.out.println("Zen model is in the list");
		}
		
		
		
		//carList.remove("i10");
		Iterator<String> itr = carList.iterator();
	//	ListIterator<String> itr=carList.listIterator();
//		while(itr.hasNext()) {
//			//System.out.println("Car model =>"+itr.next());
//		}
//		
		System.out.println("Before deletion" + carList.size());

		while(itr.hasNext()) {
			String car = itr.next();
			if(car.contains("GE")) {
				itr.remove();
				continue;
			}
			System.out.println("Car model =>"+car);
		}
		
		System.out.println("After deletion "+carList.size());
		

		
		
//		carList.clear();
//		System.out.println(carList.isEmpty());
		
		
	}
	
}
