package org.testing.Assertions;

public class AssertionHandle {
	public static void handleAssertion(String expectedUrl, String actualUrl) {
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Assertion has been passed");
		}
		else {
			System.out.println("Assertion has been failed");
		}
	}
}
