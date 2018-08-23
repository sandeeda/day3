package com.sandeep.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sandeep.day3.Employee;

class EmployeeTest {

	Employee emp1;
	
	
	@BeforeEach
	void setUp()
	{
		emp1=new Employee("Sandeep Das",157856,9000,1000);
	}
	
	@Test
	void testCalculateNetSalary() {
		
		assertEquals(13220, emp1.calculateNetSalary());
	}
	
	
	@AfterEach
	void tearDown() {
		emp1 = null;
	} 

}
