/**
 * Copyright 2013 leilove321.org, Inc. All rights reserved.
 **/
package com.leilove321.north.adapter;

import junit.framework.TestCase;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.JUnit4;


/**
 * @Source. AssertTest.java
 * <br/>
 * @Author. ZhuLei
 * <br/>
 * @History. Created on 2013-5-30, 下午5:19:41.
 */
@RunWith(JUnit4.class)
public class AssertTest extends TestCase {
    @Test
    public void testNonZero() {
        boolean flag1 = Assert.nonZero(10);
        boolean flag2 = Assert.nonZero(10 / 10);
        boolean flag3 = Assert.nonZero(10 - 10);

        assertEquals("actual - is not zero!", true, flag1);
        assertEquals("actual - is not zero!", true, flag2);
        assertFalse("failure - is zero!", flag3);
    }
}
