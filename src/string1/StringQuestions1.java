package string1;

import java.util.ArrayList;
import java.util.List;

public class StringQuestions1 {

	public String reverseStringUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	public String reverseStringUsingJustArrays(String s) {
		char[] charArray = s.toCharArray();
		char[] reverseArray = new char[charArray.length];
		int n = charArray.length;
		for (int i = n - 1, j = 0; i >= 0; i--, j++) {
			reverseArray[j] = charArray[i];
		}
		return new String(reverseArray);
	}

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

	public boolean isPalindromeUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		if (sb.toString().equals(str))
			return true;
		return false;
	}
}
