
public class String3 {

	public static void main(String[] args) {
		String s1 = "Abheri";
		String s2 = "Abhogi";
		System.out.println("The similar character in the 2 strings are");
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					System.out.println(s1.charAt(i));
				}
			}
		}

	}

}
