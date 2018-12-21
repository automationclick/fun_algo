package basicQ;

import java.util.Arrays;
import java.util.HashSet;

class ArrayTwoValueWithSum
{
	/**
	 * to find two value in given array such that is their sum is X
	 * method-1 --> using sorting
	 * @param arr
	 * @param sum
	 */
	public static void findTwoNumberWithSum(int[] arr, int sum)
	{
		if(arr.length==0)
			return;
		int rightIndex = arr.length-1;
		int leftIndex = 0;
		int[] result = new int[2];

		Arrays.sort(arr); //log(n)

		while(leftIndex < rightIndex)
		{
			if(arr[leftIndex] + arr[rightIndex] ==sum)
			{
				result[0] = arr[leftIndex];
				result[1] = arr[rightIndex];
				System.out.println("Number you are looking for is : "+arr[leftIndex]+ " and "+arr[rightIndex]);
				break;
			}
			else if(arr[leftIndex] + arr[rightIndex] < sum)
			{
				leftIndex++;
			}
			else if(arr[leftIndex] + arr[rightIndex] > sum)
			{
				rightIndex--;
			}
		}
	}
	
	/***
	 * method--> using hashing
	 * @param args
	 */
	
	public static void findTwoValueWithXSum(int[] arr, int x)
	{
		HashSet<Integer>hs = new HashSet<>();
		
		for(int i = 0; i< arr.length; i++)
		{
			if(hs.contains(arr[i]))
			{
				System.out.println("first Number is: "+(x-arr[i])+" second number is: " +arr[i]);
				break;
			}
			else
			{
				hs.add(x-arr[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		int sum =3;
		findTwoValueWithXSum(arr, sum);
	}

}