package test.day0318;

public class B {
 /* �ε� ������� ���� - 1. Ŭ���� 2. ������� 3. �ν��Ͻ� ���(new ��� ��)
    ������ �Ʒ��� ����Ǵ� ���� �ƴ�(������ �Ʒ��� - �޼���, ������) */
	static int x = 100;
	static int y = x;
	
	static int a = 100;
		   int b = a;
	
   /* int m = 100;
    static int n = m; -> ������ �Ʒ��� �����ϴ� ���� �ƴ϶�, ���� ����� ���� ����� */
	int m = n;
	static int n = 100; 
	
	//���� / �ν��Ͻ�
	static int p = 10;
	int q = 200;
	static void method( ) {
		System.out.println(B.a);
		// System.out.println(q); - �Ұ���
	/* �ν��Ͻ� ����� Ŭ���� ����� ����� �� �ִ�.
		Ŭ���� ����� �ν��Ͻ� ����� ����� �� ����. */
	}
	void instance() {
		System.out.println(B.a);
		System.out.println(q); // �ν��Ͻ� ����� Ŭ���� ��� ��� ����.
	}
	
}
