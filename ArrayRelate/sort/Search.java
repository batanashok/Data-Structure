package com.sort;

public class Search {
	
	static int linear(int number,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(number == arr[i])
			{
				return i;
			}
		}
		return -1; // element is not fond in array
	}
	
	// this is mainly use for sorted array 
	static int binary(int arr[], int leftIndex, int rightIndex,int numberForSearch)
	{
		if(rightIndex >= leftIndex)
		{
			int mid = leftIndex + (rightIndex - leftIndex)/2;
			
			if(arr[mid]==numberForSearch)
				return mid;
			else if(arr[mid]<numberForSearch)
			{
				return binary(arr,mid+1,rightIndex,numberForSearch);
			}
			else
			{
				return binary(arr,leftIndex,mid-1,numberForSearch);
			}
		}
		
		return -1; // if element is not present in array then we return -1 to indicate element is not found
	}
}
