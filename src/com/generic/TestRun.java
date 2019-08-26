package com.generic;

import java.util.ArrayList;
import java.util.List;

public class TestRun {

	public static void main(String[] args) {
		Test<String> stringTest = new Test<String>("pavel");
		Test<Integer> integerTest = new Test<Integer>(2);
		
		/**
		 * empty contrator and it's working procedure
		 */
		
	
		Test<String> testString = new Test<String>();
		testString.setObject("hello robin");
		
		testString.showObject();
		
		stringTest.showObject();
		integerTest.showObject();

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		stringTest.showList(intArray);
		stringTest.showList(doubleArray);
		stringTest.showList(charArray);
		
		/**
		 *  for multi value pass
		 */
		
		MultiTest<String, String> multiTest = new MultiTest<String, String>("pavel", "robin");
		multiTest.showObject();
		
		MultiTest<Integer, String> multiTest2 = new MultiTest<Integer, String>(3, "pavel");
		multiTest2.showObject();
		
		
		/**
		 *  for list print and show
		 */
		
		
		/**
		 *  String data show
		 */
		
		Test<String> showLisTest = new Test<String>("");
		
		List<String> listString = new ArrayList<String>();
		listString.add("pavel");
		listString.add("robin");
		listString.add("lia");
		
		showLisTest.showListFull(listString);
		
		
		/**
		 *  int data show 
		 */
		
		List<Integer> integerlList = new ArrayList<Integer>();
		integerlList.add(3);
		integerlList.add(4);
		integerlList.add(5);
		integerlList.add(6);
		
		showLisTest.showListFull(integerlList);
		
	}
}
