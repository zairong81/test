

import java.io.File;

public class MakeFolder {
	public static void main(String[] args) {
		
		String names = "������,������,���ο�,����ȣ,�����,�赵��,�����,�ڽÿ�,������,���ϸ�,������,������,������,�ſ���,�Ⱥ���,��⹮,�̰��,�̺�,�̼���,�̿�ö,���ֿ�,����,������,������,��ȫö,�����,ä�ؿ�,�ߴ�ȣ,������,ȫ����";
		
		String folder = "practice2";

		String[] n = names.split(",");
		
		int i=0;
		for(String name : n) {
			i++;
			File file = new File("D:/upload/quiz/"+folder+"/"+name);
			if( file.mkdirs() ) {
				System.out.println(name + " ����");
			} else {
				System.out.println(name + " ����!!!");
			}
		}
		System.out.println(i + "�� ���� ����");

	}
}
