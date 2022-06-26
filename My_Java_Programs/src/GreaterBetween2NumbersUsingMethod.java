
public class GreaterBetween2NumbersUsingMethod {

	public static void main(String[] args) {
		int a = 15, b = 12;
		String str = great(a, b);
		System.out.println(str);

	}

	public static String great(int a, int b) {
		if (a > b) {
			return "a is greater than b";

		} else {
			return "b is greater than a";
		}
	}
}
