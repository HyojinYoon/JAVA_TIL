package test.day0318;

public class ClassEx01 {
	public static void main(String[] args) 
	{
		System.out.println(Tv.volume); // ���� ��Ű���� �ٸ� Ŭ������ �մ� �� ��� (Ŭ������.������)
		// System.out.println(Tv.channel); -> channel�� �ν��Ͻ��� �ٷ� ��� �Ұ�
		Tv.sum(); // Ŭ���� �޼��� ȣ��
		
		Tv t = new Tv(); // �ν��Ͻ��� ��ü ���� �� ��� ����
	/*  ��������     ��ü    */
		System.out.println(t.channel);
		t.add();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 10;
		t2.channel = 20;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		Tv.volume = 30;
		System.out.println(Tv.volume);
		System.out.println(t1.volume); // �ν��Ͻ�ó�� ����� ���� - t1�� t2�� ���� ���������� ������ ���� �ƴ�.
		System.out.println(t2.volume);
		
		t1.volume = 70;
		System.out.println(Tv.volume); // -> 70
		System.out.println(t1.volume); // -> 70
		System.out.println(t2.volume); // -> 70
	}
}



// ���� ����� ���� ����ϸ� ������??? XXX - �޸𸮸� ���� ��Ƹ���.