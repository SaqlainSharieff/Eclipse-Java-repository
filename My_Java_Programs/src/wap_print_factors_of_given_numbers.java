
public class wap_print_factors_of_given_numbers {

	public static void main(String[] args) {

		int num = 15;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("the factors of number are  " + i);
			}
		}

	}

}
