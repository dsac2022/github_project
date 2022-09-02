package practice;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner s = new Scanner(System.in);
	  System.out.println("enter size");
	  int n = s.nextInt();
      int sum=0;	  
//	  int a[]= new int[n];
	  
	  for(int i=0;i<n;i++)
	  {
		  sum = sum+ s.nextInt();
	  }
	  System.out.println(sum);
	  
	  
	}

}
