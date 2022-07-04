package com.blbz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UcSevenLLTest {
	static UcSevenLL test;
	
	@BeforeClass
	public static void init() {
		test = new UcSevenLL();
	}
	
	@Test
	public void search30Test() {
	
		test.createLink();
		Object result = test.Search30();
		Object expected = 30;
		Assert.assertEquals(expected, result);
	}
	
	
	

}
