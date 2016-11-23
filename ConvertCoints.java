import java.util.Scanner;

public class ConvertCoints {
	final static int DOLLARS = 100; 	//number of cents in dollar
	final static int QUARTERS = 25;		//number of cents in quarter
	final static int DIMES = 10;		//number of cents in dime
	final static int NICKELS = 5;		//number of cents in nickel
	
	public static void main (String[] args){
		int cents = 0;
		int numDollars, numQuarters,
		numDimes, numNickels;
		int centsLeft;
		boolean isIntNum;
		
		System.out.println("Cents to Coins Program");
		System.out.println("------------------------");
		System.out.println("Enter total number of Cents(positive integer): ");
		Scanner KB = new Scanner(System.in);
		do {
			if(KB.hasNextInt()) {
				
				 cents = KB.nextInt();
				 isIntNum = true;
			}
			else {
				System.out.println("Enter total number of Cents(positive integer): ");
				isIntNum = false;
				KB.next();
			}
		}while (!(isIntNum));
		KB.close();
		//Compute total amount of dollars,quarter, dimes, nickels,and pennies.
		numDollars = cents / DOLLARS;
		centsLeft = cents % DOLLARS;
		System.out.println(centsLeft);
		numQuarters = centsLeft / QUARTERS;
		centsLeft = cents % QUARTERS;
		System.out.println(centsLeft);
		numDimes = centsLeft / DIMES;
		centsLeft = cents % DIMES;
		System.out.println(centsLeft);
		numNickels = centsLeft / NICKELS;
		centsLeft = cents % NICKELS;
		System.out.println(centsLeft);
		
		//Display resulting number of coins.
		System.out.println("For your total cents of " + cents );
		System.out.println("  you have:");
	    System.out.println("#dollars = " + numDollars);
	    System.out.println("#quarters = " + numQuarters);
	    System.out.println("#dimes = " + numDimes);
	    System.out.println("#nickels = " + numNickels);
	    System.out.println("#pennies = " + centsLeft);
	    System.out.println();
   }
		
}
