package test.day0312;

public class Practice02 
{
	public static void main(String[] args) 
	{
		int score = 80;
		int good = (score>70 ? 'A' : 'B');
			System.out.println(good); // -> 65�� ��µ�. 'A'�� ����ϰ� ������ char good = ���� ���� �ʿ�.
		char good1 = (score>70 ? 'A' : 'B');
			System.out.println(good1);
	}
}
