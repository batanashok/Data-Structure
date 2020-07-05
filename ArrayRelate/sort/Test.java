package com.sort;

public class Test {

	public static void main(String[] args) {
		
		int arr[]= {10,24,54,76,45,34,675,34,34,223,656,43,9};
		Sort.recursiveBubble(arr, arr.length);
		Sort.show(arr);
		
		System.out.println(Search.binary(arr, 0, arr.length-1, 34));

	}

}
