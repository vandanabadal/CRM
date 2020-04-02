package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod
	public void test2() {
		System.out.println("Before Method");
		
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 ");
	}
	
	@AfterMethod
	public void test3() {
		System.out.println("After Method");
		
	}

}
