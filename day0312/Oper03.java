package test.day0312;

public class Oper03 
{
	public static void main(String[] args) 
	{
		//���� ������ ->if���� ���� �����ڸ� ����ϱ� ������ �ַ� if���� �����
		int x = 10;
		int y = 20;
		// ���ǽ� ? true�� : false��; (���ǽ��� true�� true����, false�� false���� ����)
		System.out.println(x > y ? 100 : 200); //-> 200
		System.out.println(x > y ? "ũ��" : "�۴�");
		System.out.println(x < y ? "ũ��" : "�۴�");
		
		//���� ������
		System.out.println(x += y); //���ϰ� �����ض�, x = x+y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x -= y); //���� �����ض�, x = x-y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x *= y); //���ϰ� �����ض�, x = x*y;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x /= y); //������ �����ض�, x = x/y;
		System.out.println(x);
		System.out.println(y);
	}
}
