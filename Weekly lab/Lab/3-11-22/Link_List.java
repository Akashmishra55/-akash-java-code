/*Write a Java program to check if a particular element exists in a linkedlist.*/
package list_Array;

import java.util.LinkedList;

public class Link_List {
	 public static void main(String[] args) {
		  // create an empty linked list
		  LinkedList <String> c1 = new LinkedList <String> ();
		            c1.add("Blue");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Violet");
		          System.out.println("Original linked list: " + c1);

		     // Checks whether the color "Black" exists or not.
		    if (c1.contains("Green")) {
		       System.out.println("Color Green is present in the linked list.");
		    } else {
		       System.out.println("Color Green is not present in the linked list.");
		     }

		     // Checks whether the color "Akash" exists or not.
		    if (c1.contains("Akash")) {
		       System.out.println("Color Akash is present in the linked list.");
		    } else {
		       System.out.println("Color Akash is not present in the linked list.");
		     }

		 }
		}

