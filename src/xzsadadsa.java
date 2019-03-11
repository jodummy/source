import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class xzsadadsa {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < 30; i++) {
			int num = ran.nextInt(6) + 1;
			arr[num-1]++;
			
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(i+1 + ":" + arr[i]);
		}

	}
}
