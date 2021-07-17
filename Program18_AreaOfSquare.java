import java.util.Scanner;

public class Program18_AreaOfSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter value of Side: ");
		int side = scan.nextInt();
		System.out.println("Area of the sqaure is " + (side*side)+ ".");
	}
}
