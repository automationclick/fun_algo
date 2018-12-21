package basicQ;

import java.util.ArrayList;

public class Test {

	public void display(Object obj)
	{
		System.out.println("from object");
	}
	
	public void display(String str)
	{
		System.out.println("from string");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.display(null);// compiler always give preference to child type
		
		ArrayList<Integer> list = new ArrayList<>();
		list.iterator();
	}
}
