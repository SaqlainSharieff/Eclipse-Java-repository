import java.util.Scanner;

//Write a program to retrive the char from the string using methods read the string from the user
public class String6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		print(s);

	}

	public static void print(String s) {
		System.out.println("The characters are");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
