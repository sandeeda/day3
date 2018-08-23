package com.sandeep.day3;

public class BankOperation {
	
	private double savingsAccountBal;
	private double currentAccountBal;
	
	
	
	
	
	
	
	
	//constructors
	
	public BankOperation()
	{
		this.savingsAccountBal=500000;
		this.currentAccountBal=100000;
	}
	
	
	public BankOperation(double savingsAccountBal,double currentAccountBal)
	{
		this.savingsAccountBal=savingsAccountBal;
		this.currentAccountBal=currentAccountBal;
	}
	
	//constructors end
	
	
	
	
	
	//*************************WITHDRAW CASH METHOD********************************
	
	public double withdrawCash(double amount,int choice) {

		if(choice==1)
		{
			if(amount<=savingsAccountBal)
			{
				savingsAccountBal-=amount;
				return savingsAccountBal;
			}
			
			else
			{
				return savingsAccountBal;
			}
		}
		
		if(choice==2)
		{
			if(amount<=currentAccountBal)
			{
				currentAccountBal-=amount;
				return currentAccountBal;
			}
			else
			{
				return currentAccountBal;
			}
		}
		
		return 0;
		
	}


	
	
	
	
	
	
	//****************************WITHDRAW CASH METHOD ENDS*********************************
	
	
	
	
	
	
	//*********************************DEPOSIT CASH********************************
	
		

	public double depositCash(double amount, int choice) {
		if(choice==1)
		{
			if(amount<=savingsAccountBal)
			{
				savingsAccountBal+=amount;
				return savingsAccountBal;
			}
			
			else
			{
				return savingsAccountBal;
			}
		}
		
		if(choice==2)
		{
			if(amount<=currentAccountBal)
			{
				currentAccountBal+=amount;
				return currentAccountBal;
			}
			else
			{
				return currentAccountBal;
			}
		}
		
		return 0;
	}
	
	
	
	
		
	}
	
	
	

