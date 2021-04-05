package com.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>(5);
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(4);
//		
//		ArrayList aList = new ArrayList();
//		aList.add("shubham");
//		aList.add(2);
//		aList.add(true);
//		aList.add(112.33);
//		
//		System.out.println(al);
//		System.out.println(al);

		
		Pair<String,Integer> p1 = new Pair<String, Integer>("Shubham", 123);
		Pair<Boolean,Double> p2 = new Pair<Boolean, Double>(true,10.3);
		
		p1.get();
		p2.get();
		
	}

}
