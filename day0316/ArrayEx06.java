package test.day0316;

public class ArrayEx06 
{
	public static void main(String[] args) 
	{
		// �迭 ����� 1�� ��� 
		int [] x = new int[3]; //������ �ٸ� �� : new�� ���ο� �޸𸮸� ����. new�� �̿��Ͽ� ���� ���� �޸� ���� ����.
		x[0] = 10; //�� ���� ����ó�� ��� ����. ex) x[0]++;
		x[1] = 20;
		x[2] = 30; 
		
		// �迭 ����� 2�� ��� - �ֻ���
		int [] y = {10,20,30}; 
		
		x[0] = y[2]; // x�� 0��°�� y�� 2��°�� �����ض�.
		
		int a = 100;
		y[0] = a; // a�� ���� y[0]�� �����ض�.
		
		/*�迭�� ������ �̸��� Ư���� ������ �����ص� ��*/
				
		System.out.println(x[0]);
		System.out.println(y[0]);
	}
	
}
