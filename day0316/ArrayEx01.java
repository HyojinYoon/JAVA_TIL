package test.day0316;

public class ArrayEx01 
{
	public static void main(String[] args) 
	{
		// Ÿ�� [] �̸�;
		// new - ���ο� �޸𸮸� �����.
		/*int [] num; // null - �ƹ��͵� ����.(�ּҰ� ����)

		num = new int[3]; //�� ��¥���� ���� ������.(3��¥���� ����ڴ�)*/
		int [] num = new int[3]; //�� ��ȣ - 0,1,2 ������ 0���� ����
		/* double [] num = new double[3]; */
		
		System.out.println(num); // -> I@7637f22 : [I - �迭���� �ǹ� , @�� 16���� - �޸��ּ� =>�����Ѵ�
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]); //int�� ������ָ� �⺻������ 0�� ������.
		
		num[0] = 100; //0��° num�� 100 ����
		num[1] = 200;
		num[2] = 300;
		
		num[0]++;
		System.out.println(num[0]);
		System.out.println(num[1]+num[2]);
		
		int a = 100;
		System.out.println(num[0] + a); //num[0]�� �ִ� ���� int, a�� int�� ���� ����. (num+a�� X - num�� �ּ�)
		
	}
}
