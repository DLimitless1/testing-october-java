package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.*;

import com.sun.source.tree.WhileLoopTree;

public class CollectionsDriver {

	public static void main(String[] args) {
		// Collection Interface

		// List
		// ArrayList - at the EOD we must use a Concrete Class to do the work
		// #1 way of doing it
			ArrayList<Integer> arrList = new ArrayList<>();

			List<String> arrList2 = new ArrayList<String>();

		// adds to the end
			arrList.add(7);
			System.out.println(arrList);
		// adds 4 to element 0
			arrList.add(0, 4);
			System.out.println(arrList + " " + arrList.size());

			arrList.add(100);
		// remove based on index
			arrList.remove(2);

			arrList2.add("First");
			arrList2.add("Second");

		// remove based on contents
			boolean passed = arrList2.remove("Second");
			System.out.println(arrList);
			System.out.println(passed);
			System.out.println(arrList2);
			System.out.println(arrList);

		// LinkedList
		// 2nd way of doing it
			LinkedList<String> linkList = new LinkedList<>();
			List<Integer> linkList2 = new LinkedList<Integer>(arrList);

			linkList.add("Hello");
			linkList.add(0, "World");
			System.out.println(linkList);

		// Read = or access list
			System.out.println(linkList.contains("Hello"));
			System.out.println(linkList.get(1));
			System.out.println(linkList.indexOf("World"));
			linkList.add("place");
			linkList.add("holder");

		// Update existing data
			linkList.set(0, "New");
			System.out.println(linkList);

		// Set
			HashSet<String> hashset = new HashSet<>();
			HashSet<Integer> intSet = new HashSet<Integer>(8, 0.4f);
			HashSet<String> noDuplicate = new HashSet<String>(linkList);

			linkList.add("Hello");
			System.out.println(linkList);
			System.out.println(noDuplicate);
			
			// to loop or even just read from a set we use iterator
			// for each loop is read only
			for (String string : noDuplicate){
			
			if(string.equalsIgnoreCase("Hello")) {
			System.out.println("We foud the word");
			}
		}
	//we need an iterator with a while loop to do our update operations
	Iterator<String> value = noDuplicate.iterator();
	while(value.hasNext()) {
		System.out.println(value.next());
				}
			 System.out.println(noDuplicate);
			 
			 noDuplicate.remove("New");
			 noDuplicate.add("World");
			 System.out.println(noDuplicate);

		// Queue & Dequeue
			// LinkedList - polymorphism (change the LL behavior with
			Queue<String> qLinkList = new LinkedList<>(linkList);	
			
			System.out.println(qLinkList);
			System.out.println(qLinkList.remove("place"));
			
			Deque<String> dQLinkList = new LinkedList<>(linkList);
			 //  Interfaces
			
		// Map Interfaces
			
			// HashMap and TreeMap (classes)
			
				Map<String, Integer> hashMap = new HashMap<String, Integer>();
			
				hashMap.put("nickel", 5);
				hashMap.put("penny", 1);
				hashMap.put("dime", 10);
				hashMap.put("quarter", 25);
				hashMap.put("nickel", 12);
//				hashMap.put(null, 5);
				
				System.out.println(hashMap.get("penny"));
				
				for (String key : hashMap.keySet()) {
			//		System.out.println(string);
					if(key.equals("quarter") && key != null) {
						System.out.println("Found it!");
						System.out.println(hashMap.get(key));
					}	
					System.out.println(key + "" + hashMap.get(key));
				}
				TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
			
//					for (Integer entry : treeMap.entrySet()) {
//					System.out.println(entry);
//				}
				// Map 
		}

}
