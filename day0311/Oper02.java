package test.day0311;

public class Oper02 
{
	public static void main(String[] args) 
	{
		int x = 100000 * 100000;
		System.out.println(x); //100���� ���;������� int�� 20������� ǥ���� �� ����. but, ������ �ƴ� �ٸ� ���� ������ ������ ���������� Ʋ�� ���� ����
		long y = 100000 * 100000;
		System.out.println(y); //long�� 100������� ǥ���� �� ������ �ٸ� ���� ������ ����: int*int�ΰ��� �����ϱ� ����. ==> long*int, long*long ���� �ʿ�
		long z = 100000L * 100000; //�ڿ� L�� �����Ͽ� long���� ������ָ� ��
		System.out.println(z); //100��
		
		//byte�� ���� : -128~127
		byte a = (byte)(100+30); //130 , byte�� short�� longó�� L�� ���̴� ���� �ƴ϶� �̸� ��ü�� �ٿ���
		System.out.println(a); //-126 ����: �´� ���� -130������ byte�� ǥ���� �� �� ����. 
							//ǥ�� ���� �ȿ��� �ٽ� ���� ��. 127���� ���� ���� 3�� -128, -127, -126�ؼ� -126���� ���
		
		int i = 10;
		System.out.println(i % 4); // 10�� 4�� ������ 4���� ������ 2���� ���Ҵ�. 10%3�� ���, 3�����ϰ� 1�� ���Ҵٷ� 1 ���
		
		// ����
		// ��Ģ
		// �� ( >, <, >=, <=, ==)
		// �� (||, &&, !)
		// ���� (���� ? true : false)
		// ���� (=)
		
	int l = 2;
	int m = (int)l;
	System.out.println(m);
	
	double o = 3.4;
	int p = (int)o;
	System.out.println(p);
	
	int q = 3;
	double r = (double)(q);
	System.out.println(r);
	
	}
}

 