package com.stringBuffer.Assignments;

public class StringAppend {

	public static void main(String[] args) {
		
			StringBuffer sb1 = new StringBuffer("String Buffer");
			StringBuffer sb2 = (sb1.append("is a peer class of string"));
			StringBuffer sb3 = (sb2.append("that proviedes much of"));
			StringBuffer sb4 = (sb3.append("the functionality of string"));
			System.out.println(sb4);
			
	}

}
