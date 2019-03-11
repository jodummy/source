package exam;

public class test {

	static String result(String num) {
		String result = "";
		int i = 0;
		int cnt = 1;
		while (true) {
			if (i + 1 != num.length() && num.charAt(i) == num.charAt(i + 1))
				cnt++;
			else {
				result += num.charAt(i) + "" + cnt;
				cnt = 1;
			}
			i++;
			if (i == num.length()) {
				break;
			}
		}
		return result;
	}
	// 11 -> 12 ->1121 -> 122111 -> 112213 -> 12221131->1123123111 -> 12213111213113

	public static void main(String[] args) {
		System.out.println(result("1123123111"));
	}

}
