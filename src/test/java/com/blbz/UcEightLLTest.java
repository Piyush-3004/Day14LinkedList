package com.blbz;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UcEightLLTest {

	static UcEightLL test;

	@BeforeClass
	public static void init() {
		test = new UcEightLL();
	}

	@Test
	public void addInBetweenTest() {

		test.addInBetween();
		Integer actualSize = test.count();
		Integer size = 4;
		Assert.assertEquals(size, actualSize);
	}

}
