package test.day0312;

public class Ex01 
{
	public static void main(String[] args) 
	{
		// ���� - �ϳ��� �� ����
		// Ÿ�� �̸� = ��;
		int a;
		a = 10;
		
		int b = 10; //���� ���� ���Ǵ� ���!
		
		int c,d; // ���� Ÿ�� ���� ���� ����
		//c=10 , d=20; //���Ե� ���ÿ� �Ұ�. 
		c=10; d=20;
		
		int e=10, f=20;
		// int x, double y; �ٸ� Ÿ���� ���ÿ� ������ �Ұ�.
		
		int x = 10; // ����
		double y = 5.6; // �Ǽ�, �Ҽ��� ���ڸ��� ������ ������.
		boolean z = true; // ��, true/false
		
		System.out.println(x);
		int m = x+10;
		int n = m+x; //m�� ����Ǿ� �ִ� �� + x�� ����Ǿ� �ִ� �� = 20+10
		
		//int o = x+10.5; //20.5�� �ƴ�. x�� int, 10.5�� double. o�� int�� ���ϴ� ���̱� ������ ����.
		// 1. double o = x+10.5�� ���� 2. int o = (int)x+10.5�� ��������
		
		// ���� ������ (++,--) - ����/�Ǽ����� ��� ����, �̸� ��,�ڿ��� ��� ����, 1����/1����
		++x; 
		x--;
		++y; //5.6 -> 6.6
		System.out.println(++y); //���� �� ���, 6.6
		System.out.println(y++); //��� �� ����, 5.6 �ٽ� ����ϸ� 6.6
		
		int value = 100000 * 100000;
		System.out.println(value); //int�� 20������� ǥ�� �����ؼ� �ٸ� ���� ����
		// int value = 100000L * 100000 -> long Ÿ������ ������ָ� ����. (int���� ���� byte,short�� �߰��� �ٿ����� �ʾƵ� ��)
		
		String s = ""; //����� ��, string�� �����ϸ� ���ڷ� ��� ����
		
	}
	
}
