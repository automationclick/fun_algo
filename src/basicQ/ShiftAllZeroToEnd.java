package basicQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftAllZeroToEnd {

	/**
	 * to shift zero in an array to end
	 * approach --
	 * 1- first move all non-zero to front end
	 * 2- then from count to array.legnth replace with zero
	 */


	public static void shiftZero(int[] arr)

	{
		int count = 0;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] != 0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
		while(count < arr.length)
		{
			arr[count] = 0;
			count++;
		}
		System.out.println("Array Length after shifting zero toward end: --> "+arr.length);
		for(int element: arr)
		{
			System.out.print(element);
			System.out.print(" ");

		}
	}

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,0,54,3,4,5,0,-1,-2};
		shiftZero(arr);
	}
}
