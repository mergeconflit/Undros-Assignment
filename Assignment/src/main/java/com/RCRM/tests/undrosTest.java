package com.RCRM.tests;

import org.testng.annotations.Test;

import com.RCRM.pages.basetest;
import com.RCRM.pages.undrosBase;

public class undrosTest extends basetest{
	
	/*
	 * TestCase will fail as functionality is not working as expected.
	 */
	
	@Test
	public void recharge() throws InterruptedException {
		
		undrosBase UB = new undrosBase();
		UB.rechargeDetails();
		UB.cardDetails();
		UB.login();
	}

}
