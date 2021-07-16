import java.util.Scanner;
public class Program7_VowelOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = scan.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'
				|| ch=='o' || ch=='O' || ch=='u' || ch=='U')
			System.out.println("Entered Character is Vowel");
		else
			System.out.println("Entered Character is not a Vowel");
	}
}
