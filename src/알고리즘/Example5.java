package 알고리즘;


//sum 구하기
public class Example5 {
	static void print(int[] a, int index) {
		
	}

	static int sum(int[] a, int index) {
		return index;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;
		print(a, 0);
		System.out.println();
		System.out.println(sum(a, 0));
	}
}