package test.day0324;

public class Inner01 {
	int value = 10; // �ν��Ͻ� ����
	
	public void add() {
		int x = 100; // ��������
		class C{ // ����Ŭ���� - �޼��� �ȿ����� ��� ����.
			public void getData() {
				System.out.println(x);
				System.out.println(value);
			}
		}
		C c = new C(); // �޼��� ���ο��� ��ü ���� �ؾ� ��
		c.getData(); // �޼��� �ȿ��� ��ü ȣ��
	}
	
	
	class B
	{
		int value = 20; // �ν��Ͻ� ����
		void method() {
			int value = 30; // ��������
			System.out.println(value); // 30
			System.out.println(this.value); // 20
			System.out.println(Inner01.this.value); // 10
		}
	}
}
