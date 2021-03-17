package com.stackroute.mar17demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void demo() {
		
	
//		Set<String> setOfCars = new HashSet<>();
		Set<String> setOfCars = new TreeSet<>();
		setOfCars.add("1IN-Zen");
		setOfCars.add("10KR-i10");
		setOfCars.add("2IN-Swift");
		setOfCars.add("3GE-Benz");
		setOfCars.add("4IN-Zen");
		setOfCars.add("5US-Ford");

		Iterator<String> itr = setOfCars.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(setOfCars.size());
	}
	
}
