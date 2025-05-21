package JavaConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.h;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm=new HashMap<>();
		
		hm.put("abc", "123");
		hm.put("bcd", "456");
		hm.put("xyz", "987");
		
		System.out.println(hm.get("abc"));  //  123
		
		System.out.println(hm.keySet());   //  [bcd, abc, xyz]
		
		System.out.println(hm.values());    // [456, 123, 987]
		
		System.out.println(hm.entrySet());  // [bcd=456, abc=123, xyz=987]
		
		for(Entry<String, String> value:hm.entrySet()) {
			System.out.println(value.getKey());
			System.out.println(value.getValue());
			
		}

	}

}
