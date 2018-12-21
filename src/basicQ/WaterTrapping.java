package basicQ;

import java.util.Stack;

public class WaterTrapping
{
	/**
	 * to calculate water storage, for given height of array
	 * method --> 1 : using stack
	 * @param args
	 */

	public static int calculateStorage(int[] arr)
	{
		int result = 0;
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i< arr.length-1; i++)
		{
			while(!(stack.isEmpty()) && (arr[i] > arr[stack.peek()]))
			{
				int top = stack.pop();
				// bounded_height = min(height(currentindex), height(top element in stack) -height(top which we popped up just before))
				int height = Math.min(arr[i], arr[stack.peek()]) - arr[top]; 
				int distance = i - stack.peek() -1 ;
				result += height * distance;
			}
			stack.push(i); //push index to stack Note --> push index not value
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {4,0,8,9,7,8};
		System.out.println(calculateStorage(arr));

	}
}
