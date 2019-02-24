import java.util.Scanner;

/** Class to demo reading from the console --usually a keyboard. */
public class KeyboardDemo {

	/** Add the integers the user types on the console (one at a time,<br>
	 * with a return after each) and show the running sum.<br>
	 * Stop when user types STOP in caps. */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum= 0;
		while (true) {
			System.out.println("Type an integer, or STOP to end program");
			String s= sc.nextLine().trim();
			if (s.equals("STOP")) {
				System.out.println("Goodbye");
				return;
			}
			try {
				int k= Integer.parseInt(s);
				sum= sum + k;
				System.out.println("Thanks. The running sum is: " + sum);
			} catch (NumberFormatException n) {
				System.out.println("That wasn't an integer.");
			}
		}
	}
}
