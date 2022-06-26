import java.util.Scanner;

//Write a program to read a string from the user using method and print the vowels in the string using methods
public class String7 {

	public static void main(String[] args) {
		String s = store();
		print(s);
	}

	public static String store() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		return s;
	}

	public static void print(String s) {
		System.out.println("The vowels in the string are");
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
					|| (s.charAt(i) == 'u')) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
