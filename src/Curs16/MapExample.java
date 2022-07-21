package Curs16;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {


		Map<String, String> map = new HashMap<>();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductOwner");
		
		System.out.println(map.get("T"));
		System.out.println("contains key: " + map.containsKey("D"));
		System.out.println("contains key: " + map.containsValue("ProductOwner"));
		
		System.out.println("--------------------");
		
		for(String key : map.keySet()) {
			System.out.println("key: " + key);
		}
		
		System.out.println("--------------------");
		
		for(String value : map.values()) {
			System.out.println("value: " + value);
		}
		
		System.out.println("--------------------");
		
		map.remove("T");
		for(String key : map.keySet()) {
			System.out.println("key: " + key);
		}
		for(String value : map.values()) {
			System.out.println("value: " + value);
		}
		
		System.out.println("--------------------");
		
		map.replace("P", "ProductManager");
		for(String key : map.keySet()) {
			System.out.println("key: " + key);
		}
		for(String value : map.values()) {
			System.out.println("value: " + value);
		}
		
	}

}
