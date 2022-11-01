package corejavabasic;

import java.util.ArrayDeque;

class ArrayDeque_1 {

	public static void main(String[] args) {

		ArrayDeque<String> obj1 = new ArrayDeque<>();
		
		obj1.add("Vishal");
		obj1.add("Lokesh");
		
		//using addFirst() method
		obj1.addFirst("Vikram");
		
		//using addLast() method
		obj1.addLast("Bhakti");
		
		System.out.println("Array Deque: " + obj1);
	}

}
