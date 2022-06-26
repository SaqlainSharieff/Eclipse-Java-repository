package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;


public class Client2 
{
	static ShopFactory sfobj;
	static GSPrimeAcc gsprimeobj;
	static GSNormalAcc gsnormalobj;
	
	public static void main(String[] args) 
	{
		sfobj=new GSShopFactory();
		gsnormalobj=(GSNormalAcc) sfobj.getNewNormalAccount(101,"sharieff",900,50);
		gsnormalobj.bookProduct(gsnormalobj.getCharges());
		gsnormalobj.toString();
		
		gsprimeobj=(GSPrimeAcc) sfobj.getNewPrimeAccount(101,"sharieff",900,true);
		gsprimeobj.bookProduct(gsnormalobj.getCharges());
		gsprimeobj.toString();
		
		/*
		 * // Step 1 - Step a GSShopFactory gssfactory = new GSShopFactory();
		 * gssfactory.getNewPrimeAccount(123, "Vikas", 1000, true);
		 * gssfactory.getNewNormalAccount(111, "Vikas2", 1000, 50);
		 */
		  
			/*
			 * // St
p 2 GSPrimeAcc gsprime = new GSPrimeAcc(); gsprime.getAccNm();
			 * gsprime.getAccNo(); gsprime.getCharges();
			 * 
			 * // Step 4 / Step d. gsprime.bookProduct(10000);
			 * 
			 * // Step 5 / Step e. gsprime.toString();
			 * 
			 * 
			 * // Step 3 GSNormalAcc gsnormal = new GSNormalAcc(); gsnormal.getAccNm();
			 * gsnormal.getAccNo(); gsnormal.getCharges(); gsnormal.getDeliveryCharge();
			 * 
			 * // Step 4 / Step d. gsnormal.bookProduct(1000); // Step 5 / Step e.
			 * gsnormal.toString();
			 * 
			 */

	}

}
