package test.day0318;

public class Test {

	// ����Ÿ�� �̸� ()
	void add() // println�� ����� �ƴϱ� ������ MethodEx01�� ȣ��Ǿ��ٰ� void�� ���ƿ�.
	{
		// if / for / ���� / ��� ���..
		System.out.println("add ����..!!");
		// return; �� �����Ǿ� �ִ� ��.
	}
	
	int sum() 
	{
		System.out.println("sum ����..!!");
		return 10; // int�̱� ������ return���� �������� �Ѱܾ���.
	}
	
	void aaa(int x) // int x = 50
	{
		System.out.println(x + 100);
	}
	
	void bbb(int x, int y) 
	{
		System.out.println(x+y);
	}

	void ccc(int x, String y)
	{
		System.out.println(x+" "+y);
	}
	
	int  ddd(int x, int y)
	{
		int result = x+y;
		return result;
	}
	
}
