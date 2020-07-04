package com.sort;

public class Test {

	public static void main(String[] args) {
		
		int arr[]= {10,24,54,76,45,34,675,34,34,223,656,43,9};
		
		Sort.bubble(arr);
		Sort.show(arr);
		Sort.selection(arr);
		Sort.show(arr);
		Sort.recursiveBubble(arr, arr.length);
		Sort.show(arr);

	}

}
