package java06_class.manage.ver2;

import java.util.Scanner;

import java06_class.manage.Student;

public class StudentService_ver2 {

	private Scanner sc = new Scanner(System.in);

	private Student[] stuArr = new Student[3];
	
	// ver1 �ڵ� ����
	//private Student stu = new Student();
	
	
	
	// ---------- ������ ----------
	// ����Ʈ ������
	public StudentService_ver2()
	{
		for(int i=0; i<stuArr.length; i++)
			stuArr[i] = new Student();
	}
		
	
	/* ver1 �ڵ� ����
	// �Ű������� �ִ� ������
	public StudentService2(String name, int age) {
		stu.setName(name);
		stu.setAge(age);
	}
	*/
	// -------------------------
	
	
	
	// ---------- ���� �޼ҵ� ----------
	// ���° �л����� �����ϴ� ���
	private int getIdx() {
		int idx;
		do {
			System.out.print("���°�л�? ");
			idx = sc.nextInt();
			if(idx<1 || idx>3)
				System.out.println(" >> Error : 3�� �����մϴ�");
		} while(idx<1 || idx>3);
		
		return idx;
	}
	// -------------------------
	
	
	
	// ---------- ���� �Է±�� ----------
	/* ver1 �ڵ� ����
	// �������� �Է� ��� - insertInfo
	public void insertInfo() {
		System.out.println(" ++ �⺻ ���� �Է� ++");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		stu.setName(name);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		stu.setAge(age);
	}
	*/
	private void insertInfo(Student s, int i) {
		System.out.println(" ++ " + i + "��° �л� �⺻ ���� �Է� ++");
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		s.setName(name);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		s.setAge(age);
	}
		
	// 3�� �������� �Է� ��� - insertInfoAll
	public void insertInfoAll() {
		for(int i=0; i<stuArr.length; i++)
			insertInfo(stuArr[i], i+1);
	}
	
	// ���� ���� 1�� �Է�(����)
	public void insertInfoIdx() {
		int idx = getIdx();
		insertInfo(stuArr[idx-1], idx);
	}
	
	
	/* ver1 �ڵ� ����
	// �������� �Է� ��� - insertInfo(String, int)
	public void insertInfo(String name, int age) {
		System.out.println(" ++ �⺻ ���� �Է� ++");
		System.out.println("�Էµ� �̸� : " + name);
		System.out.println("�Էµ� ���� : " + age);
		stu.setName(name);
		stu.setAge(age);
	}
	*/
	
	private void insertStu(int idx) {
		insertInfo(stuArr[idx-1], idx);
		insertScore(stuArr[idx-1], idx);
	}
	
	public void insertStuAll() {
		for(int i=1; i<=3; i++)
			insertStu(i);
	}
	// -------------------------

	
	
	// ---------- ���� �Է� ��� ----------
	/* ver1 �ڵ� ����
	// 3���� ���� �Է� ��� - insertScore
	public void insertScore() {
		System.out.println(" ++ 3���� ���� �Է� ++");
		System.out.print("���� ���� �Է� : ");
		stu.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		stu.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		stu.setMath(sc.nextInt());
		
		// ����, ��� ���
		calcSum(stu);
		calcAvg(stu);
	}
	*/
	
	private void insertScore(Student s, int i) {
		System.out.println(" ++ " + i + "��° �л� 3���� ���� �Է� ++");
		System.out.print("���� ���� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("���� ���� �Է� : ");
		s.setMath(sc.nextInt());
		
		// ����, ��� ���
		calcSum(s);
		calcAvg(s);
	}
	
	// 3�� ���� �Է� - insertScoreAll
	public void insertScoreAll() {
		for(int i=0; i<stuArr.length; i++)
			insertScore(stuArr[i], i+1);
	}
	
	// ���� ���� 1�� �Է�(����)
	public void insertScoreIdx() {
		int idx = getIdx();
		insertScore(stuArr[idx-1], idx);
	}
	
	// ���� ��� ��� - calcSum
	private void calcSum(Student stu) {
		stu.setSum( stu.getKor()
				+ stu.getEng()
				+ stu.getMath() );
	}
	
	// ��� ��� ��� - calcAvg
	private void calcAvg(Student stu) {
		stu.setAvg( stu.getSum()/(double)3 );
	}
	// -------------------------
	
	
	
	// ---------- ��� ��� ----------
	/* ver1 �ڵ� ����
	public void printStu() {
		System.out.println(" ++ ��� ++");
		System.out.println("�̸� : " + stu.getName());
		System.out.println("���� : " + stu.getAge());
		
		System.out.println("Kor : " + stu.getKor());
		System.out.println("Eng : " + stu.getEng());
		System.out.println("Math : " + stu.getMath());

		System.out.println("���� : " + stu.getSum());
		System.out.println("��� : " + stu.getAvg());
	}
	*/
	
	private void printStu(Student s, int i) {
		System.out.println(" ++ " + i + "��° �л� ��� ++");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
				s.getName(),s.getAge(),
				s.getKor(),s.getEng(),s.getMath(),
				s.getSum(),s.getAvg());
	}
	
	// 3�� ��� ��� - printStuAll
	public void printStuAll() {
		
//		int i=1;
//		for( Student s : stuArr )
//			printStu(s, i++);
		
		for(int i=0; i<stuArr.length; i++)
			printStu(stuArr[i], i+1);
	}
	
	// �л� 1�� �����ؼ� ��� ���
	public void printStuIdx() {
		int idx = getIdx();
		printStu(stuArr[idx-1], idx);
	}
	// -------------------------
}
