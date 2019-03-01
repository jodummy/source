import java.util.HashMap;
import java.util.Map;

public class app {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("¡∂¡ÿº≠", 4); //±‚øı 
		map.put("¡∂¡ÿº≠", 3); //»£¡ÿ
		map.put("¡∂¡ÿº≠", 1); //øµπŒ
		map.put("øµπŒ", 1); //øµπŒ
		
		System.out.println(map.get("¡∂¡ÿº≠"));
		System.out.println(map.get("øµπŒ"));
		
		
	}
}
