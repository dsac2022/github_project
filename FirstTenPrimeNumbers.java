package practice;

public class FirstTenPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner s = new Scanner(System.in);
		int num = 0, f = 0;
		for (int i = 1; i <= 10; i++) {
			num = i;

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					f++;
				}

			}

			if (f == 2)
				System.out.println("" + num + " is a prime number");
			else

				System.out.println("   " + num + " is not a prime number");
			f = 0;
		}

	}

}
