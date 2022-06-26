import java.util.Scanner;

class A {
	public static int read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		int num = sc.nextInt();
		return num;
	}

	public static void pal(int num) {
		int temp = num, sum = 0, rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Its an palindrome " + sum);
		} else {
			System.out.println("Its not an palindrome " + sum);
		}
	}
}

public class B {

	public static void main(String[] args) {
		int num = A.read();
		A.pal(num);

	}

}
