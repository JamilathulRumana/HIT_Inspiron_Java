import java.util.Scanner;


public class Program6_i_QuotientRemainder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for dividend: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the value for divisor: ");
		int num2 = scan.nextInt();
		double quotient = (double)num1/num2;
		int reminder = num1%num2;
		System.out.println("quotient = " +quotient);
		System.out.println("Reminder = " +reminder);
	}

}
