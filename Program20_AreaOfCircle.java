import java.util.Scanner;
public class Program20_AreaOfCircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter value of radius: ");
		double radius = scan.nextDouble();
		System.out.println("Area of Circle is " + (Math.PI*radius*radius));
	}
}
