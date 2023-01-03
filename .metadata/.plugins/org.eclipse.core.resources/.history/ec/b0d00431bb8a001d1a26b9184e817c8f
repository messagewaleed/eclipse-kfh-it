package com.kfh.waleed.training;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)//Only create the object of this class once
public class AppTest {

	App app;
	
	
	@BeforeAll
	static void callAtFirst() {
		System.out.println("callAtFirst()...");
	}
	
	@AfterAll
	static void callAtEnd() {
		System.out.println("callAtEnd()....");
	}
	
	@BeforeEach
	void callBeforeEach() {
		System.out.println("beforeEach()...");
	}
	
	@AfterEach
	void callAfterEach() {
		System.out.println("afterEach()...");
	}
	
	
	
	
	
	
	
	

	@Test // Tells Junit to treat this as a test case
	@DisplayName("Check for Divide")
//	@EnabledOnJre(JRE.JAVA_12)//This test would only run on Java 12
	void testDivide() {
//		org.junit.jupiter.api.Assertions.fail("Test case failed...");

		int actual = new App().divide(300, 100);

		int expected = 3;

		org.junit.jupiter.api.Assertions.assertEquals(expected, actual, "Division isn't right...");
//		org.junit.jupiter.api.Assertions.assertNotEquals(expected, actual);

		org.junit.jupiter.api.Assertions.assertNull(app);

		org.junit.jupiter.api.Assertions.assertTrue(false);

//		Combine multiple assertions
		org.junit.jupiter.api.Assertions.assertAll(
				() -> org.junit.jupiter.api.Assertions.assertEquals(expected, actual, "Expected and actual not equal"),
				() -> org.junit.jupiter.api.Assertions.assertEquals(40, new App().divide(40, 2)),
				() -> org.junit.jupiter.api.Assertions.assertTrue(false));

	}
	
	
//		@Test
//		@Disabled //Signals to Junit to not run this test
		@DisplayName("Check for Palindrome")
		@ParameterizedTest
		@ValueSource(strings = {"kfh", "madam", "atif"})
//		@EnabledOnOs(OS.WINDOWS)//This test would now only run on systems running Windows OS
		void testForPalindrome(String value) {
			org.junit.jupiter.api.Assertions.assertTrue(new App().checkForPalindrome(value), "Passed value isn't a palindrome");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
