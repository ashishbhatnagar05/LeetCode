package string1;

import java.util.ArrayList;
import java.util.List;

/** @author kaal */
public class StringQuestions1 {

	/**
	 * Method returns reverse of given string.Uses StringBuilder.
	 *
	 * @param str
	 * @return
	 */
	public String reverseStringUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	/**
	 * Method returns reverse of given string. Uses Arrays.
	 *
	 * @param s
	 * @return
	 */
	public String reverseStringUsingJustArrays(String str) {
		char[] charArray = str.toCharArray();
		char[] reverseArray = new char[charArray.length];
		int n = charArray.length;
		for (int i = n - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = charArray[i];
		}
		return new String(reverseArray);
	}

	/**
	 * Method returns the count of Palindrome out of the provided String's substring
	 *
	 * @param str
	 * @return
	 */
	public int countPalindromeSubstrings(String str) {
		String[] substrings = getSubStrings(str);
		int count = 0;
		for (String subStr : substrings) {
			if (isPalindrome(subStr)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Method returns Array of all substrings of provided string.
	 *
	 * @param str
	 * @return
	 */
	public String[] getSubStrings(String str) {
		int strLength = str.length();
		int resultArrayLength = 0;
		for (int i = 0; i <= strLength; i++) {
			resultArrayLength = resultArrayLength + i;
		}
		String[] resultArray = new String[resultArrayLength];
		int n = str.length();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				resultArray[count] = str.substring(i, j);
				count++;
			}
		}
		return resultArray;
	}

	/**
	 * Method returns true if provided string is palindrome.
	 *
	 * @param str
	 * @return
	 */
	public boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
		char[] reverseArray = new char[charArray.length];
		int n = charArray.length;
		for (int i = n - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = charArray[i];
		}
		String reverseString = new String(reverseArray);
		if (reverseString.equals(str))
			return true;
		return false;
	}

	/**
	 * Method returns count of palindrome substrings of provided string.Uses List.
	 *
	 * @param str
	 * @return
	 */
	public int countPalindromeSubstringsUsingList(String str) {
		List<String> substrings = getSubStringsUsingList(str);
		int count = 0;
		for (String subStr : substrings) {
			if (isPalindromeUsingStringBuilder(subStr)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Method return List of substring.Uses List.
	 *
	 * @param str
	 * @return
	 */
	public List<String> getSubStringsUsingList(String str) {
		List<String> resultList = new ArrayList<String>();
		int n = str.length();
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				resultList.add(str.substring(i, j));
			}
		}
		return resultList;
	}

	/**
	 * Optimized version of counting no. of palindrome substring
	 *
	 * @param str
	 * @return
	 */
	public int countPalindromeSubstringsOptimized(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String s = str.substring(i, j);
				boolean ispalindrome = isPalindromeUsingStringBuilder(s);
				if (ispalindrome) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * Method returns if the provided string is Palindrome. Uses StringBuilder.
	 *
	 * @param str
	 * @return
	 */
	public boolean isPalindromeUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if (sb.toString().equals(str))
			return true;
		return false;
	}

	/**
	 * Method return count of the letters in last word of a string
	 *
	 * @param str
	 * @return
	 */
	public int lengthOfLastWord(String str) {
		return str.trim().length() - str.trim().lastIndexOf(" ") - 1;
	}

	/**
	 * Method compares two string and returns the different character present
	 *
	 * @param s
	 * @param t
	 * @return
	 */
	public char findTheDiffereceChar(String s, String t) {
		char c = ' ';
		char[] tArray = t.trim().toCharArray();
		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i]);
			if (!s.contains(new StringBuilder(tArray[i]))) {
				c = tArray[i];
			}
		}
		return c;
	}

	/**
	 * Method returns array of String after removing at most one character.Can be
	 * used for identical character string.
	 *
	 * @param str
	 * @return
	 */
	public String[] removedCharacterSubstring(String str) {
		char[] cArray = str.toCharArray();
		String[] strArray = new String[cArray.length];
		for (int i = 0; i < cArray.length; i++) {
			strArray[i] = str.replaceAll(String.valueOf(cArray[i]), "");
		}
		return strArray;
	}
}
