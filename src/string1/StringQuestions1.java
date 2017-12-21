package string1;

public class StringQuestions1 {

	public String reverseStringUsingStringBuilder(String s) {

		StringBuilder sb = new StringBuilder();

		char[] charArray = s.toCharArray();
		int n = charArray.length;
		for (int i = n - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();
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
}
