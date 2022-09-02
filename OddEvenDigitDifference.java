package practice;

public class OddEvenDigitDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7530,rem=0,evenSum=0,oddSum=0;
	       
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                evenSum = rem+evenSum;
            }
            else
            {
                oddSum = rem+oddSum;
            }
            n=n/10;
        }
        if(evenSum>oddSum)
        System.out.println(evenSum-oddSum);
        else
        System.out.println(oddSum-evenSum);

	}

}
