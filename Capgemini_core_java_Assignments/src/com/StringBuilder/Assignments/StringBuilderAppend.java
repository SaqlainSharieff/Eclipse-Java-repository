package com.StringBuilder.Assignments;

public class StringBuilderAppend {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("String Builder ");
		StringBuilder sb2 = (sb1.append("is a peer class of string "));
		StringBuilder sb3 = (sb2.append("that provides much of "));
		StringBuilder sb4 = (sb3.append("the functionality of string."));
		System.out.println(sb4);
		
	}

}
