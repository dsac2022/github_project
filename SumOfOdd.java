package practice;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) 
	{
		int n=12345,rem=0,sum=0;
	       while(n>0)
	       {
	           rem=n%10;
	           if(rem % 2!= 0)
	           {
	               sum=rem+sum;
	              
	           }
	           n=n/10;
	          
	       }
	       System.out.println("sum of odds:"+sum);
	      
	    
	    
	}
}
