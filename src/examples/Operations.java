package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Operations {
	// Contains basic operations on ArrayList and LinkedList, as well as Collections class static methods on lists.
	
	private static ArrayList<String> stringArrList;
	private static LinkedList<String> stringLinkedList;

	public static void main(String[] args) {
		stringArrList = new ArrayList<String>();
		stringLinkedList = new LinkedList<String>();
		
		// add elements to arraylist
		
		stringArrList.add("John");
		stringArrList.add("Adam");
		stringArrList.add("Jeff");
		stringArrList.add("Dave");
		stringArrList.add("Eleanor");
		stringArrList.add("Anna");
		
		// add elements to LinkedList
		
		stringLinkedList.add("Mads");
		stringLinkedList.add("Casper");
		stringLinkedList.add("Kenneth");
		stringLinkedList.add("John-John");
		stringLinkedList.add("Arne");
		stringLinkedList.add("David");
		
		System.out.println("array list contains: " + stringArrList);
		System.out.println("linked list contains: " + stringLinkedList);
		
		// get element from arraylist & linked list (via get() method from list interface)
		
		System.out.println("get(2) from array list: " + stringArrList.get(2));
		System.out.println("get(2) from linked list: " + stringLinkedList.get(2));
		
		// remove element from arraylist and linkedlist
		stringArrList.remove(0);
		stringArrList.remove("Adam");
		System.out.println("removing entry at index 0 and object equal to \"Adam\" from arraylist.");
		System.out.println("Array list now contains: " + stringArrList);
		
		stringLinkedList.remove(0);
		stringLinkedList.remove("John-John");
		System.out.println("removing entry at index 0 and object equal to \"John-John\" from arraylist.");
		System.out.println("Linked list now contains: " + stringLinkedList);
		
		
		// Collections class static methods
		Collections.reverse(stringArrList); // reverse contents of list
		System.out.println("reversed array list:" + stringArrList);
		
		Collections.shuffle(stringArrList); // shuffle contents of list
		System.out.println("shuffled array list: " + stringArrList);
		
		Collections.sort(stringArrList); // sort contents of list
		System.out.println("sorted array list: " + stringArrList);
		
		Collections.swap(stringArrList, 0, stringArrList.size()-1); // swap first and last element of list
		System.out.println("swapped first and last in array list: " + stringArrList);
		
	}

}
