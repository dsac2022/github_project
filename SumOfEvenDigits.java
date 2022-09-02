package practice;

public class SumOfEvenDigits{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123456,sum=0,rem=0;
		while(n>0)
		{
			rem = n%10;
			if(rem%2==0)
			{
				sum= sum+rem;
			}
			n=n/10;
		}
        System.out.println("sum of even digits is :"+sum);
	}

}
