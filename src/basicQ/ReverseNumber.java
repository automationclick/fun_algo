package basicQ;

public class ReverseNumber 
{

	/**
	 * 
	 */
		public static void printAtoZ()
		{
			for(char c ='a'; c <='z'; c++)
			{
				System.out.println(c);
			}
		}
	
	/**
	 * to reverse a string
	 * time complexcity O(n)
	 */
	public static void reverseString_1(String str)
	{
		String reverse ="";
		System.out.println("String before Reversing: ---> "+str);
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("String after Reversing: ---> "+reverse);
	}
	
	/**
	 * to reverse a string
	 * time complexcity: --> O(n/2)
	 */
	public static void reverseString_2(String str)
	{
		System.out.println("Input String  before reverse:-->"+str);
		char[] charArray = str.toCharArray();
		int end = charArray.length-1;
		int start = 0;
		while (end >start)
		{
			//swap string 
			char temp = charArray[start] ;
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
			
		}
		String reverse = new String(charArray);
		System.out.println("Input String  after reverse:-->"+reverse);
	}
	
	
	/**
	 * tom reverse a given number
	 */
	public static long reverseNumber(long num)
	{
		long reverse = 0;
		System.out.println("number before reversing: --> "+num);
		if(num<10)
		{
			return num;
		}
		while(num != 0)
		{
			long digit = num % 10;
			reverse = reverse * 10 + digit;
			num =num/10;
		}
		System.out.println("Number after reversing: -->"+reverse);
		return reverse;
	}
	
	public static void main(String[] args) {
//		reverseNumber(9876543210343535L);
//		reverseString_2("abcdefghhijklmnopqrstuvwxyz");
		printAtoZ();
	}
}
