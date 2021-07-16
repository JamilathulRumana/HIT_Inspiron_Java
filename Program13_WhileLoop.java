import java.util.Scanner;
public class Program13_WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting number below 10: ");
		int startingNumber = scan.nextInt();
		int sum = 0;
		while(startingNumber<=10)
		{
			 sum = sum + startingNumber;
			startingNumber++;
		}
		System.out.println(sum);
	}
}
