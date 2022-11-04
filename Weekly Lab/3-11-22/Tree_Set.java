//wap for tree set
package list_Array;

import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		 // creating TreeSet 
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();

		   // Add numbers in the tree
		   tree_num.add(8);
		   tree_num.add(26);
		   tree_num.add(40);
		   tree_num.add(28);
		   tree_num.add(46);
		   tree_num.add(60);
		   tree_num.add(86);
		   tree_num.add(99);
		   tree_num.add(21);

		   System.out.println("Strictly greater than 70: "+tree_num.higher(70));
		   System.out.println("Strictly greater than 40: "+tree_num.higher(40));
		   }    
		}
