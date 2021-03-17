package com.stackroute.mar17demo02.newpkg;

import java.io.IOException;

public class MainApp {
	
	public static void main(String[] args) {
	
		
		try {
			MapDemo.demo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
