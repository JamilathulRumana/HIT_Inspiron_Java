import java.util.Scanner;
public class Program21_ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		/*System.out.println("Enter 3 digit number: ");
		int number = scan.nextInt();
		int firstnumber = number/100;
		int last2 = number % 100;
		int secondnumber = last2/10;
		int thirdnumber = last2%10;
		System.out.print(thirdnumber);
		System.out.print(secondnumber);
		System.out.print(firstnumber);*/
		System.out.println("Enter number");
		int number = scan.nextInt();
		int reversenumber = 0;
		while(number!=0)
		{
			reversenumber =reversenumber *10;
			reversenumber = reversenumber + (number%10);
			number = number/10;
		}
		System.out.println("Reversed Number: "+ reversenumber );
	}

}
