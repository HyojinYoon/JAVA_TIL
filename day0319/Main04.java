package test.day0319;

public class Main04 { // final = ���
	// ��� �̸��� ��� �빮�ڷ� �Ѵ�!!
	
	// �ʱ�ȭ ��� 3���� �� �Ѱ�����!!! �̿��Ͽ� �� ���� ����.
	final static int x = 100; // -> �̹� ����� �ʱ�ȭ�� ���� ������ ��
	final int y; // -> ���� �ʱ�ȭ�� �̷������ ���� ����
	
	{
		y = 300; // -> ��� �ʱ�ȭ�� ���� ���
	}
	
	/*Main04(){
		y = 400;  -> ��� �ʱ�ȭ���� ���� �����߱� ������ ������ ��� �Ұ�
	}*/
	
	public static void main(String[] args) {
		
		final int x = 10; // ó�� �� ���� �� �ٸ� �� ���� �Ұ� ex)ID
		/*x = 20;
		  x = 30; */ 
		
		final int age = 20; 
		final int AGE = 20; // ����� �̸��� �빮�ڷ� �������ֱ�!!
		
		int y = x; 
		int z = y + x; 
		
		// x++; -> ���� ���������� �ٲ�� ������ ��� �Ұ�
		// x+=2; -> ���� ���������� ���ԵǴ� ���� ��� �Ұ�
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
