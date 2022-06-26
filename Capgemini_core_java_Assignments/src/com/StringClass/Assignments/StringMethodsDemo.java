package com.StringClass.Assignments;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1 = "Java String refers to collection of Strings which are storedin heap memory";
		String s2 = "Java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('a', '$'));
		System.out.println(s1.contains("collection"));
		System.out.println(s1.matches(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
