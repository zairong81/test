package java11_collection.practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		
		lottoDisplay();
		
	}
	
	public static void lottoDisplay() {
		Random ran = new Random(); // ���� ��ü
		
		Set set = new TreeSet(); //Set
		
		while( set.size() != 6 ) { //�ߺ����ŵǸ� ���� 6�� �ֱ�
			set.add(ran.nextInt(45)+1);
		}
		
		int[] dest = new int[set.size()]; // int[] ����
		Object[] src = set.toArray(); // Set -> Object[]

		for(int i=0; i<dest.length; i++) { //���� ����
			dest[i] = (int)src[i];
		}
		
		System.out.println(Arrays.toString(dest)); //���
	}
}












