/*write a program to compare two sets and retain element which are the same on both set*/package list_Array;

import java.util.HashSet;

public class St {
	public static void main(String[] args) {
	     // Create a empty hash set
	        HashSet<String> h_set1 = new HashSet<String>();
	     // use add() method to add values in the hash set
	          h_set1.add("Virat");
	          h_set1.add("Legend");
	          h_set1.add("Akash");
	          h_set1.add("Fan");
	          System.out.println("Frist HashSet content: "+h_set1);
	          HashSet<String>h_set2 = new HashSet<String>();
	       // use add() method to add values in the hash set
	          h_set2.add("Virat");
	          h_set2.add("Legend");
	          h_set2.add("Akash");
	          h_set2.add("Fan");
	          System.out.println("Second HashSet content: "+h_set2);
	          h_set1.retainAll(h_set2);
	          System.out.println("HashSet content:");
	          System.out.println(h_set1);
	     }
	}

