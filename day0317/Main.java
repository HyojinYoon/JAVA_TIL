package test.day0317;

public class Main 
{
	public static void main(String[] args) 
	{
		// ��ü ����� ��� - ���� package�� �ִ� class ����
		// ���� => Ŭ������ ������;
		// ���� => ������ = new Ŭ������();
		// Ŭ����, �迭 = ������ ������ Ÿ��
		Tv t;
		t = new Tv(); // Tv ����! ==> tv Ŭ������ �Ŀ�, ä��, ���� �����س��� ������, 3�� �޸� ����
		Car c = new Car(); // Car ����! ==> �÷�, ���ǵ� 2�� �޸� ����
		Cls01 c1 = new Cls01();
		Main m = new Main();
		int [] a = new int [3];
		// ������ �޼��� �� ��ŭ �޸𸮰� ������.
		
		// ���� ���赵�� ������ Tv�� 3�� �����ߴٴ� �ǹ�
		// tv1, tv2, tv3 => ��������(���۷�������)  *�������� : �޸��� �ּ� ����
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		Tv tv3 = new Tv();
		System.out.println(tv1); // -> test.day0317.Tv@5d22bbb7  *Ŭ�����̸�(��ǰ)@�ּ�
		System.out.println(tv2); // -> test.day0317.Tv@41a4555e
		System.out.println(tv3); // -> test.day0317.Tv@3830f1c0
		
		// ù���ڰ� �빮�� = Ŭ���� ==> String�� Ŭ����
		String s = new String(); 
	}
}
