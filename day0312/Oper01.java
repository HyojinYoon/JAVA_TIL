package test.day0312;

public class Oper01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		System.out.println(x > y); //�񱳿����� , �񱳴� ���� �� ���, �� ���갪�� ����ϴ� ��(true/false)
		System.out.println(y > x); //->true
		
		//print�� �ӿ��� �������� ���� boolean���� ������ �����س���!
		
		boolean result = x > y; //print�� �ȿ��� �������� ���� boolean���� ������ �����ϰ� ����ϴ� ���� ���� �ڵ�.
		System.out.println(result); //�񱳿����� ->false
		
		result = x < y; //���� ���� ������
		System.out.println(result); //�񱳿����� ->true
		
		result = x != y; // �� ���� �ٸ���.
		System.out.println(result); //->true
		
		result = x == y; // �� ���� ����.
		System.out.println(result); //->false
		
		result = x+10 == y; //��Ģ���� �� ��
		System.out.println(result); //->true
	}
}
