package string1Test;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import string1.StringQuestions1;

public class StringQuestions1Test {
	private StringQuestions1 stringQuestions1;

	@Before
	public void setup() {
		stringQuestions1 = new StringQuestions1();
	}

	@Ignore
	@Test
	public void reverseStringUsingStringBuilder() {
		String str = stringQuestions1.reverseStringUsingJustArrays("Hello");
		System.out.println(str);
	}

	@Ignore
	@Test
	public void reverseStringUsingJustArraysTest() {
		String str = stringQuestions1.reverseStringUsingJustArrays("Hello");
		System.out.println(str);
	}

	@Ignore
	@Test
	public void isPalindromeTest() {
		boolean isPalindrome = stringQuestions1.isPalindrome("aba");
		System.out.println(isPalindrome);
	}

	@Ignore
	@Test
	public void getSubStringsTest() {
		String[] stringArray = stringQuestions1.getSubStrings("abcdef");
		System.out.println(Arrays.asList(stringArray));
	}
	//@Ignore
	@Test
	public void countPalindromeSubstringsTest() {
		int count = stringQuestions1.countPalindromeSubstringsUsingMap("aaa");
		System.out.println(count);
	}
}
