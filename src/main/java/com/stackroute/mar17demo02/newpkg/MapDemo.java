package com.stackroute.mar17demo02.newpkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	static String filepath = System.getProperty("user.dir")+"/data/player.csv";
	static Map<String,Integer> headerMap = new LinkedHashMap<>();
	static Map<String,String> innerData = null;
	static Map<Integer,Map<String,String>> dataSet = new LinkedHashMap<>();
	
	public static void demo() throws IOException{
		
		String[] expectedCols = new String[] {"playername","country"};
		
		BufferedReader br = new BufferedReader(new FileReader(new File(filepath)));
		
		String[] header = br.readLine().split(",");
		int i=0;
		for(String head: header) {
			headerMap.put(head,i++);
		}
		
		String newData="";
		
		int dataSetCounter=0;
		while((newData = br.readLine()) !=null){
			
			String[] data = newData.split(",");
			if(data[2].contains("Cricket")) {
				innerData = new LinkedHashMap<>();
				int index=0;
				
				   for(String col:expectedCols) {
						Integer j= headerMap.get(col);
						innerData.put(col, data[j]);
					}
			    dataSet.put(++dataSetCounter, innerData);

			}
		}
		
		dataSet.forEach((ky,val) -> System.out.println(ky+" "+val));
		
	}
	
}
