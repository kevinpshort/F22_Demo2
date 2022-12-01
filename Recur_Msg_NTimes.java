package wk14_Recursion;

public class Recur_Msg_NTimes {

	public static void main(String[] args) {
		/*
		Implement a Java class, Recur_Msg_NTimes
		Implement a class with main method vars String msg and int n
		In a method, use a for loop to print msg n times
		In a new method use a recursive algorithm to print msg n times
		*/

		// Declare vars
		int n = 13;
		String msg = "Printing with a for loop in the method";
		String msg2 = "Printing with a recursive algo";
		
		// Invoke methods
		prtMsg(msg, n);
		System.out.println();
		prtMsg2(msg2, n);
	}
	
	// Class methods
	
	public static void prtMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
	public static void prtMsg2(String msg2, int n) {
		if (n > 0) {  // n = 0 is the base case
			prtMsg2(msg2, n-1);  // n-1 acts as our decrementor
			System.out.println(msg2);
		}
	}
}
