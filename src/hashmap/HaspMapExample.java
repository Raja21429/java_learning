package hashmap;

import java.util.HashMap;
//import java.util.function.BiConsumer;

public class HaspMapExample {
	
static boolean answer=false;
	public static void main(String[] args) {
		HashMap<String,String> hashMap = new HashMap<String,String>();
		
		hashMap.put("Name", "Raja");
		hashMap.put("Age", "22");
		hashMap.put("Gender", "Male");
		hashMap.put("etc", "....");
		
		System.out.println(hashMap.get("Name"));
		System.out.println(hashMap.get("Age"));
		System.out.println(hashMap.get("Gender"));
		System.out.println(hashMap.get("etc"));
		
		
		
		//default method           
		System.out.println("1) contains :"+hashMap.containsKey("Name"));
		//System.out.println(hashMap.remove("Age"));
		System.out.println("2) "+hashMap.clone());
		System.out.println("3) "+hashMap.keySet());
		System.out.println("4) "+hashMap.size());
		System.out.println("5) "+hashMap.entrySet());
		System.out.println("6) "+hashMap.containsValue("Name"));
		System.out.println("7) "+hashMap.values());
		System.out.println("8) "+hashMap.isEmpty());
		
		
		//using foreach
		String search=".";
		hashMap.forEach((key,val)->{
			if(key.contains(search) || val.contains(search)) {
			answer=true;
		}
			});
		System.out.println(answer);
	}
}
		


