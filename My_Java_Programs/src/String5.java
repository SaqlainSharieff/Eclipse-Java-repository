
//Write a program to retrive the char from the string using scanner class
import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		System.out.println("The characters are");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}
