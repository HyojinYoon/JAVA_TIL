package test.day0315;

public class BreakEx01 
{
	public static void main(String[] args) 
	{
		for(int a=0; a < 10; a++)
		{
			if(a == 5) {
				break; // 5�� �Ǹ� �ݺ�����.
			}
			System.out.println(a);
		}
		for(int a=0; a < 10; a++)
		{
			if(a == 5) {
				continue; // 5���� ��µǴ� ���.�ݺ��ϴٰ� 5�� �Ǿ��� ��, ������ ���߰� ���� �������� ����(������� �������� ���� �������� �Ѿ��.)
			}
			System.out.println(a);
		}
	}
}
