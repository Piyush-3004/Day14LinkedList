package com.blbz;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UcNineTest {
	static UcNine test;

	@BeforeClass
	public static void init() {
		test = new UcNine();
	}

	@Test
	public void addInBetweenTest() {

		test.createLink();
		test.remove40();
		Integer actualSize = test.size();
		Integer size = 3;
		Assert.assertEquals(size, actualSize);
	}

}
