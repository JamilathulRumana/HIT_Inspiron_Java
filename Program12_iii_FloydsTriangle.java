import java.util.Scanner;


public class Program12_iii_FloydsTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter no of row: ");
		int row = scan.nextInt();
		int count = 1;
		for(int i = 1; i<=row; i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
			
		

	}
}
