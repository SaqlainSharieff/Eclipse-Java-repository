
public class String2 {

	public static void main(String[] args) {
		String s = "Sharieff";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'f') {
				count++;
			}

		}
		System.out.println("The character F is repeated " + count);
	}
}


