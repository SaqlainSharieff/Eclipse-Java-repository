import java.util.Scanner;

public class TakingKeybordInputs {

	public static void main(String[] args) {
		System.out.println("Taking input from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		System.out.println("The sum of this number is " + (a + b));

	}

}
