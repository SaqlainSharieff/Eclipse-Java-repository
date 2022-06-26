
public class WapToFindWheatherTheGivenNoIsPrimeOrCompositNo {

	public static void main(String[] args) {
		int num = 9, count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("its an prime number " + num);
			System.out.println("the number of factor are " + count);
		} else {
			System.out.println("its an composit number " + num);
			System.out.println("the no of factors are " + count);
		}

	}

}
