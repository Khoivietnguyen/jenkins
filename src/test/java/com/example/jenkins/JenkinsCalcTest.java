package com.example.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void testAdd() {
		JenkinsCalc calc = new JenkinsCalc();
		assertEquals(10, calc.addNumbers(3, 7));
	}
	
	@Test
	public void testSubtract() {
		JenkinsCalc calc = new JenkinsCalc();
		assertEquals(10, calc.subtractNumbers(13, 3));
	}
	
}
