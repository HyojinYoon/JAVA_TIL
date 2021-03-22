package test.day0319;
class B{
	int b = 1000; // �ν��Ͻ� ���� (AŬ�������� ��ü ����)
}
class A{
	int a = 500; // �ν��Ͻ� ���� - ��ü�� ���� �Ŀ� ��� ����(TestŬ�������� ��ü ����)
	B b1 = new B(); // �ν��Ͻ� ������ ����
	B b2; // B b1 = null;
}
class Test{
	static int x = 200; // Ŭ���� ����
	static int y = Main.x; // -> Main�� x�� y�� ���� ����.(���� �����̱� ������ ���� ������ �����)
	static A a1 = new A(); // Ŭ���� ������ ����
}

public class Main {
	static int x = 100; // Ŭ���� ����
	
	public static void main(String[] args) // -> �� ���Ͽ� main�� 1��!!
	{
		System.out.println(Main.x); // -> Ŭ������.������ (�������� �ʴ� ���� ����)
		System.out.println(x); // -> �ڱ� Ŭ�������� ����Ǳ� ������ Ŭ������ ��������
		
		System.out.println(Test.x); // -> TestŬ������ x����
		
		System.out.println(Test.a1.a); // -> newA()�� ��ü�� ��������� �� ���� a�� ���
									   // *** newA()�� a1�� ����ϸ� �ּҸ� ��µ�.
		System.out.println(Test.a1.b1.b); // TestŬ������ a1=AŬ����-b1=BŬ����-b=1000;
		System.out.println(Test.a1.b2); // b2�� null�̱� ������ �� ������ ���� ����

	}
}

