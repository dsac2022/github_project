package practice;

import java.util.Scanner;

public class PrimeNumberBasicLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=83,f=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		if(f==2)
			System.out.println(""+n+" is a prime number");
		else
			System.out.println(""+n+" is not a prime number");
		
	}

}
