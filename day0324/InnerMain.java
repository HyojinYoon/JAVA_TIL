package test.day0324;

public class InnerMain {
	public static void main(String[] args) {
		Inner i = new Inner(); // Inner��ü �����Ͽ� A�� �޸𸮿� �ø�.(k�� ����)
		Inner.A a = i.new A(); // A ��ü �����Ͽ� k�� �޸𸮿� �ø�.
		System.out.println(a.k);
		
		
		System.out.println(Inner.B.x); // static - ��ü �������� �̸����� ����
		
		
		Inner.B b = new Inner.B(); // �ν��Ͻ� - ��ü ���� �� ���
		System.out.println(b.y);
	}
}
