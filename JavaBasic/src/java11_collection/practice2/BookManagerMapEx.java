package java11_collection.practice2;

import java.util.HashMap;
import java.util.Scanner;

public class BookManagerMapEx {
	
	private static final Scanner sc = new Scanner(System.in);

	private static final BookManagerMap bmMap = new BookManagerMap();

	//�޴� ���
	private static final int NEW = 1;
	private static final int DEL = 2;
	private static final int SEARCH = 3;
	private static final int PRINT = 4;
	private static final int SORT = 5;
	private static final int EXIT = 6;
	
	public static void main(String[] args) {

		menu();

		
		
		//�׽���
//		HashMap<String, Book> testMap = new HashMap<>();
//		testMap.put("100001", new Book("100001", 1, "�ι�����1", "�ι�����1"));
//		testMap.put("200005", new Book("200005", 2, "�ڿ�����1", "�ڿ���������1"));
//		testMap.put("400004", new Book("400004", 4, "��Ÿ����1", "��Ÿ����1"));
//		testMap.put("100009", new Book("100009", 1, "�ι�������2", "�ι�����2"));
//		testMap.put("300007", new Book("300007", 3, "�Ƿ�ͱ��1", "�Ƿ�����1"));
//		testMap.put("200003", new Book("200003", 2, "�ڿ�����2", "�ڿ���������2"));
//		
//		BookManagerMap bmMapTest = new BookManagerMap(testMap);
//		bmMapTest.displayAll();
//		
//		bmMapTest.putBook(new Book("400010", 4, "��Ÿ�����̿�", "��Ÿ����3"));
//		bmMapTest.putBook(new Book("400011", 4, "��Ÿ��Ÿ��Ÿ", "��Ÿ����4"));
//		
//		Book tmp = inputBook();
//		bmMapTest.putBook(tmp);
//		
//		bmMapTest.displayAll();
//		
//		System.out.println("-----");
//		System.out.println("�ι�����1 : " + 
//				bmMapTest.searchBook("�ι�����1") );
//		System.out.println("���� å : " + 
//				bmMapTest.searchBook("���� å") );
//		
//		System.out.println( bmMapTest.searchBook(inputBookTitle()) );
//		
	
	}
	
	public static void menu() {
		
		int sel=0;
		
		do {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println();
			System.out.println(" 1. �� ���� �߰�");
			System.out.println(" 2. ���� ����");
			System.out.println(" 3. ���� �˻� ���");
			System.out.println(" 4. ��ü ���");
			System.out.println(" 6. ����");
			
			sel = sc.nextInt();
			
			switch(sel) {
			case NEW:
				break;
				
			case DEL:
				break;
				
			case SEARCH:
				break;
				
			case PRINT:
				break;
				
			case SORT:
				break;
				
			case EXIT:
				break;
			}
			
		} while( sel != EXIT );
	}
	
	//Book ��ü�� �ʵ尪�� Ű����� �Է¹޾� �ʱ�ȭ�ϰ� ��ü ����
	public static Book inputBook() {
		Book book = new Book();
		
		System.out.println(" + + + ���ο� å ���� �Է� + + +");
		System.out.print("å ��ȣ : ");
		book.setbNo( sc.nextLine() );
		
		System.out.print("ī�װ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		book.setCategory( sc.nextInt() );
		sc.nextLine();
		
		System.out.print("å ����: ");
		book.setTitle( sc.nextLine() );
		
		System.out.print("å ���� : ");
		book.setAuthor( sc.nextLine() );
		
		return book;
	}
	
	//���� �Ǵ� �˻��� ���� ���� Ÿ��Ʋ�� Ű����� �Է¹޾� ����
	public static String inputBookTitle() {
		System.out.print("�������� �Է��ϼ��� : ");
		return sc.nextLine();
	}
}






















