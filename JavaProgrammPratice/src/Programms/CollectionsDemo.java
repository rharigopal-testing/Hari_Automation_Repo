package Programms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsDemo {

	public static void ArrayListDemo() {

		ArrayList al = new ArrayList();
		// List al1 = new ArrayList();
		// ArrayList <String> al2 = new ArrayList<String>();

		// Adding elements in the list
		al.add(100);
		al.add(11.34);
		al.add(true);
		al.add(null);
		al.add(false);
		al.add('A');
		al.add("Java");

		System.out.println("Printing all the elements in the ArrayList " + al);

		// Updating elements in the list
		al.add(4, "Selenium");
		System.out.println("Printing all the elements in the ArrayList after updating" + al);

		System.out.println("Iterating using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("Iterating using enhanced for loop");
		for (Object k : al) {
			System.out.println(k);
		}
		System.out.println("Iterating using iterator");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Deleting element from array list
		al.remove(3);
		System.out.println("Printing after deleting element index 3 " + al);

		// Clearing all the elements from array list
		al.clear();

		// Checking array list is empty
		System.out.println(al.isEmpty());

	}

	public static void HashSetDemo() {
		// HashSet hs = new HashSet();
		Set hs = new HashSet();
		// HashSet<integer> hs = new HashSet<integer>();

		// adding element in hashset
		hs.add("java");
		hs.add('C');
		hs.add(null);
		hs.add(true);
		hs.add(1000);
		hs.add(1.111);
		hs.add(null);
		hs.add(true);
		hs.add(1000);

		System.out.println("Printing all the elements of hashset " + hs);

		// Iterating using enchanced for loop
		System.out.println("Iterating using enchanced for loop");
		for (Object l : hs) {
			System.out.println(l);
		}

		// Iterating using iterator
		System.out.println("Iterating using enchanced for loop");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Accessing specific element by converting HashSet to Arraylist

		ArrayList als = new ArrayList(hs);
		System.out.println(als);
		System.out.println("Accessing specific element " + als.get(3));

		// clearing hashset
		hs.clear();

		// checking hashset is empty
		System.out.println(hs.isEmpty());

	}

	public static void HashMapdemo() {
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		java.util.HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
	
		//adding key and value in the hashmap
		hm.put(1, "java");
		hm.put(2, "selenium");
		hm.put(3, "C#");
		hm.put(4, "automation");
		
		//update the value 
		hm.put(3, ".net");
		System.out.println(hm.entrySet());
		
		//remove pair
		hm.remove(4);
		System.out.println(hm.entrySet());
		
		//getting only key
		System.out.println(hm.keySet());
		
		//getting only value
		System.out.println(hm.values());
		
		//getting both key value pair
		System.out.println(hm.entrySet());
		
		//iterating using enhanced for loop
		
		for (int s : hm.keySet())
		{
			System.out.println(s+"   "+hm.get(s));
		}
		
		//iterating using iterator 
		
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			 Entry <Integer, String> entry = it.next();
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}
	

	public static void main(String[] args) {

		//CollectionsDemo.ArrayListDemo();
		//CollectionsDemo.HashSetDemo();
		CollectionsDemo.HashMapdemo();
	}

}
