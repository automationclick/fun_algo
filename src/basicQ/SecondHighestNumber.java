package basicQ;

public class SecondHighestNumber 
{

	/**
	 * to find second highest number in array
	 */
	
	public static void secondHighest(int[] arr)
	{
		int firstHighest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++)
		{
			int num = arr[i];
			if(num > firstHighest)
			{
				secondHighest = firstHighest;
				firstHighest = num;
			}
			else if(num > secondHighest)
			{
				secondHighest = num;
			}
		}
		
		System.out.println("max number in array is "+firstHighest);
		System.out.println("second highest in array is "+secondHighest);
	}
	
	public static void main(String[] args) {
		int[] arr = {11,2,3,4,5,6,7,8,9};
		
		secondHighest(arr);
	}
}
