package com.tns.client;

import com.tns.framework.*;

import java.io.PrintStream;

import com.tns.application.*;//normalAcc

class bookProduct 
{
	public static bookProduct book; /* = new one(); */ //ins by itself
	float deliveryCharge;
	private bookProduct ()
	{
	  System.out.println("Delivery charges for non-prime account users");	//instance creation
	}
	 
	 public static bookProduct getInstance() 
	 {
		 if(book == null)
		 {
		 book= new bookProduct(); 
		 
		 }
		 return book;
	 }

	@Override
	public String toString() {
		return "bookProduct [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	/*
	 * public static char[] hasCode() { // TODO Auto-generated method stub return
	 * null; }
	 */
	
}

public class Client {
	
	public static void main(String[] args) {
		bookProduct book= bookProduct.getInstance();
		//System.out.println(bookProduct.hasCode());
		
        
	}

}