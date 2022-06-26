package Day_22_01_2022_Assignment;

import java.lang.*;

public class String_Buffer_Reverse {

	public static void main(String args[]) {
		StringBuffer sbf = new StringBuffer("Activision!");
		System.out.println("String buffer = " + sbf);

		// Here it reverses the string buffer
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);
	}
}