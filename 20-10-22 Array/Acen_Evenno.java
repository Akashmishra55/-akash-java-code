package array;

import java.util.Scanner;

public class Acen_Evenno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" print  even numbers in array ");
        System.out.print("Enter the size of array: ");
        int akas = sc.nextInt();
        int arr[] = new int[akas];
        for(int i=0; i<akas; i++) {
            System.out.print(" putting random num"+ i +" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Even number in array are");
        for(int i=0; i<akas; i++)
        {
            if(arr[i]%2==0){
                System.out.print(arr[i]+"\t");
            }
        }
	}
}

