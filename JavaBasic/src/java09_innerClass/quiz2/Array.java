package java09_innerClass.quiz2;


public class Array implements ArrayAction {
	String[] arr = new String[10];

	@Override
	public void add(String element) {
		int idx; //���� ��ġ �ε���
		
		//���� ��ġ ã��
		for(idx=0; idx<arr.length; idx++) { //�迭�� ���̸�ŭ
			if( arr[idx] == null ) { //����ִ� ������ idxã��
				break;
			}
		}
		
		// �迭�� ũ�⺸�� ���� �����͸� �Է��ϴ� ��Ȳ - ���� ó��
		if( idx >= arr.length ) {
			return;
		}
		
		arr[idx] = element; //����
	}
	
	@Override
	public void print() {
		int idx;
		
		//�迭�� ��� ��� ���
		for(idx=0; idx<arr.length; idx++) {
			if( arr[idx] != null ) { //null�� �ƴϸ� ���
				System.out.println( arr[idx] );
				
			} else { //null�� ������ �ߴ�
				break;
				
			}
		}
	}

	@Override
	public void remove(String element) {
		int idx = find(element);
		
		// ������� ��ҷκ��� ������ �ִ� ��ҵ���
		//��� ��ĭ�� ��ܼ� �����Ѵ�
		for(; idx<arr.length-1; idx++) {
			arr[idx] = arr[idx+1];
		}
		
		// �迭�� ���� �� �ִ� ��Ȳ������ ������ ��ҿ� null�� ����
		arr[idx] = null;
	}

	@Override
	public String get(int idx) {
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int idx; //���� ��ġ �ε���
		
		//���� ��ġ ã��
		for(idx=0; idx<arr.length; idx++) { //�迭�� ���̸�ŭ
			if( arr[idx].equals(element) ) { //����ִ� ������ idxã��
				break;
			}
		}
		
		if(idx==arr.length) {
			return -1;
		} else {
			return idx;
		}
	}
}






