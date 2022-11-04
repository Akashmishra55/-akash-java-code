/*Write a Java program to change priorityQueue to maximum priorityqueue.*/
package list_Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		  PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());

		   // Adding numbers in the Queue
		   pq1.add(18);
		   pq1.add(52);
		   pq1.add(91);
		   pq1.add(22);
		   pq1.add(160);

		   System.out.println("\nOriginal Priority Queue: "+pq1);

		System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = pq1.poll()) != null) {
		    System.out.print(val+"  ");
		      }
			  System.out.print("\n");
		  }
		}

