package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Soring_compareto {

	public static void main(String[] args) {
		
		List<String> arr_list = new ArrayList<String>();
		arr_list.add("raj");
		arr_list.add("Sam");
		arr_list.add("abi");
		arr_list.add("kumar");
		
		Collections.sort(arr_list, sortvalues);
	
		System.out.println(arr_list);
		

	}
	
	public static Comparator<Object> sortvalues = new Comparator<Object>() {

		@Override
		public int compare(Object o1, Object o2) {
			String e1 = (String) o1;
			String e2 = (String) o2;
			return e1.toLowerCase().compareTo(e2.toLowerCase());
		}
	};

}
