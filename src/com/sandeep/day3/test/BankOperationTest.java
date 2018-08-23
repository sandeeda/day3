package com.sandeep.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sandeep.day3.BankOperation;

class BankOperationTest {

	
	BankOperation atm1;
	
	@BeforeEach
	void setUp()
	{
		atm1=new BankOperation();
	}

	@Test
	void withdrawCashTest() {
		assertEquals(400000, atm1.withdrawCash(100000, 1));
	}
	
	@Test
	void depositCashTest()
	{
		assertEquals(600000, atm1.depositCash(100000, 1));
	}
	
	

	@AfterEach
	void tearDown() {
		atm1 = null;
	}
	


}
