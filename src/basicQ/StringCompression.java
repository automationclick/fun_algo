package basicQ;

public class StringCompression 
{

	/**
	 * to compress string 
	 * example: aaccccbbb --> a2c4b3
	 */
	public static void stringCompressor(String str)
	{
		int length = str.length();
		int count = 0;
		for(int i = 0; i<length-1; i++)
		{
			count = 1;
			while( i< length-1 && (str.charAt(i) == str.charAt(i+1)))
			{
				count++;
				i++;
			}
			System.out.print(str.charAt(i));
			if(count >1) {System.out.print(count);}
		}
	}

	//second method

	public static void stringCompressor2(String str)
	{
		int length = str.length();
		int count = 1;
		for(int i = 0; i<length-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				count++;
			}
			
			else if((str.charAt(i) != str.charAt(i+1)) || i == length-1)
			{
				System.out.print(str.charAt(i));
				if(count >1)
				{
					System.out.print(count);
					//reset count to 1
					count = 1;
				}
			}
			
			if(i == length-1)
			{
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {

		String str = "aaaaaaaaaaaaaabcd";

		stringCompressor2(str);

	}
}
