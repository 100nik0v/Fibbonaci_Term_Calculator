package calculators;

import java.util.Scanner;

public class Fibonacci {
	public static void main (String args[]) {
		System.out.println("Welcome to the Fibonnacci Sequence Generator");
		System.out.println("--------------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("Which term of the fibonnacci sequence do you wish to see?");
		int pyti = Integer.parseInt( in.nextLine() );
		int pythagorean = pyti - 2;
		int termn = 0;
		double t1 = 1 ;
		double t2 = 1 ;
		double f = 0;
		//int i = 0;
		
		if(pyti < 3) {
			f= 1;
		} else {
			while (termn < pythagorean) {
				f = t1 + t2;
				t1 = t2;
				t2 = f;
				termn++;
			}
		}	
		System.out.println(f);
	}
}
