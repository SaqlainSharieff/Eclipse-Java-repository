//Write a program to find the occurance of a particular character in a string using method

public class String8 {

	public static void main(String[] args) {
		String s = "Sharieff";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'f') {
				count++;

			}
		}
		print(count);

	}

	public static void print(int count) {
		System.out.println("The character f is repeated " + count);

	}

}
