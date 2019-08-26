package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Bound {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(2);
		integers.add(5);
		
		double sum = sum(integers);
		System.out.println("Integer sum: "+ sum);
		
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(3.3);
		doubles.add(3.4);
		
		System.out.println("Double sum: "+sum(doubles));

	}

	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}
}
