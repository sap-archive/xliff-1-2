package com.sap.mlt.xliff12.impl.attribute;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinWidthImplTest {

	@Test
	public void testMinHeightImpl() {
		MinHeightImpl attr = new MinHeightImpl("abc");
		assertEquals("abc", attr.getValue());
	}

}
