package test.day0319;

public class Main02 { // �޼���
	public static void main(String[] args) {
		//add �޼��带 ȣ���Ͻÿ�!
		add(); // ���� Ŭ���� �ȿ� �־ �̸� ���� ����.
		Main02.add(); // �������� �ʴ� ���� ����.
		
		int x = bbb() + 100; // 1.�޼���ȣ�� 2.10+100 3.x�� ����
		System.out.println(x);
		
		Test t = ccc(); //ccc�� ����Ÿ���� Test�̱� ������ Test��ü�� ����
		System.out.println(t); // -> TestŬ������ �ּ� ���
		System.out.println(t.x); // 200 , TestŬ������ int x = 200;
	}
	
	static Test ccc() {  // -> Main Ŭ������ TestŬ����
		Test t1 = new Test(); // -> ����Ÿ�Ե� �������� �� �� ����
		return t1;
	}
	
	static int bbb() {
		return 10; // int�� ���ϰ��� ������ �� �־����! bbb�� ȣ���ϸ� 10�� ȣ���� ������ ���ư�.
	}
	
	static void add() { // void - ���� ���� ����
		System.out.println("Ŭ���� �޼���");
	}
}
