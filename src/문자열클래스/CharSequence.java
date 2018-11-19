package 문자열클래스;

public interface CharSequence {
	char charAt(int index);

	int length();

	CharSequence subSequence(int start, int end);

	String toString();
}