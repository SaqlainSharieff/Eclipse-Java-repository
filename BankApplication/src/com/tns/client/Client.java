package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sb = new MMSavingAcc(6012456, "jhonwick", 10000, true);
		CurrentAcc cu = new MMCurrentAcc(6022142, "doctor strange", 20000, 25000);

		cu.withdraw(15000);
		cu.deposit(10000);
		System.out.println(cu.toString());
		sb.withdraw(4000);
		sb.deposit(2000);
		System.out.println(sb.toString());

	}

}