package test.day0318;

public class ClassExB01 {
	public static void main(String[] args) {
		// B Ŭ������ p ���� ��� - (Ŭ���� �̸�. �����̸�)
		System.out.println(B.p);
		
		// B Ŭ������ q���� ��� - �ν��Ͻ� -> ��ü ���� �� ���
		B b1 = new B();
		System.out.println(b1.q);
		
		// instance �޼��� ȣ�� - ��ü ���� �� ���
		b1.instance();
		
		// Ŭ���� �޼��� method() ȣ�� - Ŭ�����̸�.�޼����̸�
		B.method();
	}
}
