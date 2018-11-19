package map;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Example1a {
	public static void main(String[] args) throws IOException {
		String filePath = "e:/a.java";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		while (scanner.hasNext()) {
			String s = scanner.next();
			System.out.println(s);
		}
		scanner.close();
	}
}