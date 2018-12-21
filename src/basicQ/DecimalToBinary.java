package basicQ;

import java.lang.reflect.Array;
import java.util.ArrayList;import org.omg.Messaging.SyncScopeHelper;

public class DecimalToBinary {

	/**
	 * convert deciml to binary
	 */
	
	public static void decimalToBinary(int num)
	{
		ArrayList list = new ArrayList<>();
		
		while(num>0)
		{
			int digit = num % 2;
			list.add(digit);
			num = num / 2;
		}
		
		list.forEach(i -> System.out.print(i));
	}
	
	public static void main(String[] args) {
		decimalToBinary(8);
	}
}
