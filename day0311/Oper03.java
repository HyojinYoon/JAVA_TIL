package test.day0311;

public class Oper03 
{
	public static void main(String[] args) 
	{
		char c = 'A'; // �� ����
		
		// ����, �Ǽ�, �� ==> �⺻�������� Ÿ��
				// String ==> ������������ Ÿ��
				// ���ڿ� (+) ����Ͽ� ������ ������ �� ����.
		
		int x = 10;
		int y = 20;
		String s = "hello"; // ���ڿ�
		System.out.println(x);
		System.out.println("x���� ��="+x); //string+int=string(���ڿ�) , +�� ����(�����Ѵٴ� �ǹ�)
		System.out.println(x+" "+y);
		System.out.println("x+y="+x+y); //��µ� ���� ��� string
		System.out.println("x+y="+(x+y));
		System.out.println(x+"+"+y+"="+(x+y)); //'+'�� Ȭ����ǥ�� ����ϸ� char�� �νĵǾ� ���ڷ� ������ ��.
		
		String a = "60";
		int b =60;
		System.out.println(a+b); //a�� string�̱� ������ 6060���� ���
		
		//char c = 'A'; //65  *-1�� ������ ���, ���ڰ� ���ٴ� �ǹ� ex.������ ������ �˷��� �� -1�� ǥ��

		//����ȹ���, �̽������� ���� ==> Ư������
		System.out.println("\"hello\""); // \�� �־ �ְ� ���� Ư������ ����
		System.out.println("\'hello\'");
		System.out.println("\\hello\\");
		System.out.println("\thello"); // \t�� tab
		System.out.println("hello\n world"); // \n�� �ٹٲ� , ������ \n
		System.out.println("hello\r world"); // \r�� �ٹٲ� , ������ \r
		/* \n, \r �ٹٲ� ������������ �۵��� �� ����(�ü�� ����) \r\n �ü���� ������� �ٹٲ��� �ϱ� ���� �Բ� ��� */	
	}
}
