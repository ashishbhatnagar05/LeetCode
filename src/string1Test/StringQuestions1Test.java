package string1Test;

import org.junit.Before;
import org.junit.Test;

import string1.StringQuestions1;

public class StringQuestions1Test {
	private StringQuestions1 stringQuestions1;

	@Before
	public void setup() {
		stringQuestions1 = new StringQuestions1();
	}

	@Test
	public void reverseStringUsingStringBuilder() {
		String str = stringQuestions1.reverseStringUsingJustArrays("Hello");
		System.out.println(str);
	}

	@Test
	public void reverseStringUsingJustArraysTest() {
		String str = stringQuestions1.reverseStringUsingJustArrays("Hello");
		System.out.println(str);
	}
}
