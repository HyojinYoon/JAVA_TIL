package test.day0326;

public class Student {
	public final static int cla = 1; //Ŭ���� ���� (���)
	public static Student s = new Student();
	
	int x = 100; // �ν��Ͻ� �⺻�� ����***
	int y = Student.cla; // Ŭ����Ÿ���� ��𼭵� ��� ����. y�� ���� ����
	
	// �ν��Ͻ� ������ ��ü���� �� ��� ���� / i�� Ŭ���������� ���۰� ���ÿ� �޸𸮿� �ö�
	//public static int i = x;  - X
	//public static int i = new Student().x; //��ü�� �����ϰ� ������� ��ü�� x�� ����ؼ� �����ϰڴ�.- ��� x
	
	/* Ŭ���� ������ �ν��Ͻ� ������ ������ �� ����. 
	   �޼��带 ����ؼ� �����ؾ� �Ѵ�. */
	
	Tv t = new Tv(); // �ν��Ͻ� ������ ����***
}
