package test.day0318;

public class MethodEx01 {
	public static void main(String[] args) {
		Test t = new Test ();
		t.add(); // ȣ��(����) - add �޼��带 �����Ͻÿ�.
		
		int x = t.sum(); // 10�� ���� ���ƿ�.
		
		System.out.println("x");
		System.out.println("main ����");
		
		t.aaa(50); // �Ű������� ���� �־���� ��. -> x�� 50 ����
		
		t.aaa(200);
		
		t.bbb(10, 20);
		int a = 100;
		int b = 200;
		t.bbb(a, b);
		
		t.ccc(100, "hello");
		
		int y = t.ddd(2, 5);
		System.out.println(y);
	}
}
