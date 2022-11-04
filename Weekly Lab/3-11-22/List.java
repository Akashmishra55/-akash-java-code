/* Write a Java program to replace the second element of a ArrayList with the specified element*/
package list_Array;
import java.util.ArrayList;

public class List {
	 public static void main(String[] args){
		  ArrayList<String>  color = new ArrayList<String>();

		  color.add("Blue");
		  color.add("Green");

		  System.out.println("Original array list: " + color);
		  String new_color = "Green";
		  color.set(1,new_color);

		  int num=color.size();
		  System.out.println("Replace second element with 'Green'."); 
		  for(int i=0;i<num;i++)
		  System.out.println(color.get(i));
		  }
		}

