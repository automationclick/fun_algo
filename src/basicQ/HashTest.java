package basicQ;

import java.util.Hashtable;

public class HashTest {
	
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put(null, "");
		
		System.out.println(ht.get("1"));
	}

}
