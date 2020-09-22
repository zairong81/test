package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_DataInputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체 생성
		File file = new File("./src/java14_io/filterStream", "DataTest.txt");

		//데이터 입력 스트림 객체
		DataInputStream dis = null;
		
		try {
			//입력 스트림 객체 생성
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(file) ));
			
			int d1 = dis.read();
			boolean d2 = dis.readBoolean();
			char d3 = dis.readChar();
			double d4 = dis.readDouble();
			int d5 = dis.readInt();
			
			System.out.println("d1 : " + (char) d1);
			System.out.println("d2 : " + d2);
			System.out.println("d3 : " + d3);
			System.out.println("d4 : " + d4);
			System.out.println("d5 : " + d5);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










