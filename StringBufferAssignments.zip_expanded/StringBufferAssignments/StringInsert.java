package com.Capgemini.StringBufferAssignments;

public class StringInsert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("It is used to _ at the specific index position");
		System.out.println(sb.replace(14, 15, "insert text"));

	}

}
