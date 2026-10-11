package com.Map;

import java.util.HashMap;

public class Hashmap_exp {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "ram");
		
		hm.put(2, "sam");
		
		hm.put(6, "ravi");
		
		hm.put(3, "sai");
		
		System.out.println(hm);
		
//		hm.remove(2);
		
		System.out.println(hm.containsKey(3));
		
		System.out.println(hm.containsValue("ram"));
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
