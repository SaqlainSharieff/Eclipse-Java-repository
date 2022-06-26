
// Special number or not using methods
import java.util.Scanner;

class A1 {
	public static int read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		return num;
	}

	public static void special(int num) {
		int temp = num, rem = 0, sum = 0;
		while (num > 0) {
			int fact = 1;
			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;

		}
		if (sum == temp) {
			System.out.println("Its is a special num " + sum);
		} else {
			System.out.println("Its not a special num " + sum);
		}
	}
}

public class B1 {

	public static void main(String[] args) {
		int num = A1.read();
		A1.special(num);

	}

}
