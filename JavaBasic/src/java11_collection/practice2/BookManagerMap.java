package java11_collection.practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BookManagerMap {

	private HashMap<String, Book> booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap<>();
	}
	
	public BookManagerMap(HashMap<String, Book> map) {
		this.booksMap = map;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//�ʿ� ��ü �߰�, ������ȣ�� Ű�� �����
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	//�ʿ��� ��ü ����
	public void removeBook(String key) {	
		booksMap.remove(key);
	}
	
	//�������� ��ġ�ϴ� ��ü�� ������ȣ�� ����
	//�������� ��ü�� �ʿ� ������, null ������
	public String searchBook(String bTitle) { //entrySet() ���
		Set keys = booksMap.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = booksMap.get(iter.next());
			
			if( bTitle.equals(currentBook.getTitle()) ) {
				return currentBook.getbNo();
			}
		}
		
		return null;
	}
	
	//������ ��� ��� : keySet() ���
	public void displayAll() {
		System.out.println(" + + + ��� å ���� + + +");
		System.out.println("��ȣ\tī�װ�\t����\t����");
		
		Set keys = booksMap.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = booksMap.get(iter.next());
			
			System.out.print(currentBook.getbNo() + "\t");
			System.out.print(getCategoryText(currentBook.getCategory()) + "\t");
			System.out.print(currentBook.getTitle() + "\t");
			System.out.println(currentBook.getAuthor() + "\t");
		}
		
	}
	
	private String getCategoryText(int category) {
		switch(category) {
		case 1:
			return "�ι�\t";
		case 2:
			return "�ڿ�����";
		case 3:
			return "�Ƿ�\t";
		case 4:
			return "��Ÿ\t";
		default:
			return null;
			
		}
	}
	
	//key�� �ش��ϴ� Book ���
	public void printBook(String key) {
		
	}
}
















