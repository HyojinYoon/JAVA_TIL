package test.day0317;

public class ObjectEx03 
{
	public static void main(String[] args) 
	{
		// ���� ����
		Tv t; // ���� ������ ����(�ּ�) ���� / TvŬ������ Ÿ�� - ���� ����� ��. (ex.ch, vol-����2��, power-��1��)
			  // ��� ������ ������ ������ 11���� �޼ҵ�/�����Ͱ� �ִ�.
		int a; // ���� �⺻�� ����(��) ���� / int Ÿ�� - ������ ���� ����
		/* ���� ���� ������ �ƹ� �͵� ���� ���� */
		
		// ������ ����(�� ����) �� ����Ѵ�.
		t = new Tv();
		
		Tv t2 = t; // t�� t2�� ���� �ּҸ� ����ϰ� ��.
		
		t.channel = 77;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2.channel = 88; // ���� �ּ��̱� ������ t2�� ���� ������ t���� ����.
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		System.out.println(t);
		System.out.println(t2); // t, t2 �ּ� ����
		
		/* ������ �����ε�
		Tv(int a, long b){}
		Tv(long a, int b){}
		Tv(long a, double b){
		
		Tv t3 = new Tv(200);
		Tb t4 = new Tv(100L, 200);
		Tv t5 = new Tv(100L, 20.0); */
	
	}
}
