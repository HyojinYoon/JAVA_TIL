package test.day0311;

public class Oper01 
{
	public static void main(String[] args) 
	{
		int a = 10;
		++a; //���������� - �����̸� �յڿ� ��� ��� ����
		// a++; 
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//System.out.println(++a); // 1����(����) �� ���
		System.out.println(a++); //��� �� ���� (��°��� ������ �Ǳ� ���� ��)
		System.out.println(a); //�ٽ� ����� �ϸ� ����� ���� �ͷ�
		
		// ������ �� ���� - (=)����
		// ���� ������
		++a; // a = a+1; 1������ ������ a�� ���� ������ ��
		// System.out.println(++a); �� 11�̸�, �ٽ� System.out.println(a);�� ����ص� 11�� ����Ǿ� ����
		//but, System.out.println(a++);�̸� 10���� ����� �ǰ�, �ٽ� System.out.println(a)�� �� �� 11�� ����� ��.->��� �� ����
	}
}
