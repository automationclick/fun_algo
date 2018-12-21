package basicQ;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	/**
	 * merge two given array in ascending order
	 */

	public static void merge(int[] left, int[] right, int[] originalArray)
	{

		int leftLength = left.length;
		int rightLength = right.length;

		int l =0;
		int r = 0;
		int k = 0;

		while(l <leftLength && r < rightLength)
		{
			if(left[l] <= right[r])
			{
				originalArray[k] = left[l];
				l++;
				k++;
			}
			else
			{
				originalArray[k] = right[r];
				r++;
				k++;
			}
		}
		while(l < leftLength)
		{
			originalArray[k] = left[l];
			k++;
			l++;
		}
		while(r < rightLength)
		{
			originalArray[k] = right[r];
			r++;
			k++;
		}
	}
	
	/**
	 * sort a array using merge sort
	 */
	
	public static int[] mergeSort(int[] arr)
	{
		
		if(arr.length < 2)
		{
			return arr;
		}
		int arrLength =arr.length;
		int mid = arr.length/2;
		
		int[] left = new int[mid];
		int[] right = new int[arrLength-mid];
		for(int i = 0; i< mid; i++)
		{
			left[i] = arr[i];
		}
		for(int j = mid; j < arrLength; j++)
		{
			right[j - mid] = arr[j];
		}
		//first sort left array then right
		mergeSort(left);
		mergeSort(right);
		//then merge both left and right array
		merge(left, right, arr);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,5,3,2,7,1,9,2};
		int[] a = mergeSort(arr);
		
		printArray(a);
		
	}
	
	
	
	
	
	static void printArray(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
}
