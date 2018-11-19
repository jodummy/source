package ���Խ�;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example1ex {
	static String readTextFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String[] args) throws IOException {
		String path = "d:/temp/Ȩ������_�Խ���.html";
		String s = readTextFile(path, Charset.forName("EUC-KR"));
		System.out.println(s);
	}
}