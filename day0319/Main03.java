package test.day0319;// �ʱ�ȭ

class Tv{
	//int channel; //Ŭ����,�ν��Ͻ� �⺻�� ���� = 0
	int channel = 10; // ����� �ʱ�ȭ
	static int volume = 100; // ����� �ʱ�ȭ
	
	{ // �ν��Ͻ� �ʱ�ȭ ��� -- ������ ����
		channel = 20; // -> ����� ���� �ǹ̰� ������.
	}
	static { // Ŭ���� �ʱ�ȭ ��� - ���� �� �� �� ���� ����
		volume = 200;
		System.out.println("Ŭ���� ���"); // ���� ���� ��µ�
	} 
	
	{
		System.out.println("�ν��Ͻ� ���");
	}
	
	
	Tv(){ // ������ - ���� ����Ǵ� ��
		System.out.println("������");
		channel = 30; // -> �����, ��� ���� �ǹ̰� ������.
	}
}

public class Main03 { 
	public static void main(String[] args) {
		int x; // �������� - �⺻�� ���� �ȵ�
		// System.out.println(x); - x�� �ƹ��� ���� ��� �����߻�
		Tv t1 = new Tv(); 
		Tv t2 = new Tv(); // Tv�� channel���� 10�� ���� = �ʱⰪ.�ʱ�ȭ��
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}
