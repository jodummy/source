import java.util.HashMap;
import java.util.Map;

public class app {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("���ؼ�", 4); //��� 
		map.put("���ؼ�", 3); //ȣ��
		map.put("���ؼ�", 1); //����
		map.put("����", 1); //����
		
		System.out.println(map.get("���ؼ�"));
		System.out.println(map.get("����"));
		
		
	}
}
