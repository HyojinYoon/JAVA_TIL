package test.day0316;

public class ArrayEx05 
{
	public static void main(String[] args) 
	{	//������ �迭			��(����) ��(����)
		int [][] num = new int [3][2]; // �� 3��, �� 2������ ���� (���� 0,1,2 ���� 0,1)
		num[0][0] = 100; //0�� 0�� �ڸ�
		num[0][1] = 200; //0�� 1�� �ڸ�
		num[2][1] = 300; //2�� 1�� �ڸ�
		//[��][��] �� �� ��� �Է������ ��. num[0] = 100;�� �Ұ���.
		
		int [][] num2 = {{10,20}, {30,40}, {60,70}}; // {0�� �� ��}, {1���� ��}, {2���� ��}
						/* { {10,20},
						  	 {30,40},
						     {60,70} };   ���� ���� ���Ե� ����*/
		
		// �����迭
		int [][] num3 = { {10,20,30},
						  {30,40},
						  {60,70,80,90} };
		System.out.println(num[0][3]); // �����޼���
		
		int [][] num4 = new int [3][]; //���� ������ 3��, ���� ������ �̿ϼ�
		num4[0] = new int [3];
		num4[1] = new int [2];
		num4[2] = new int [4]; //���� ���� ����
		
		//������ ���� = �ּ�
		int [] k = new int[3];
		
		//�⺻�� = ��
		int a = 100;
	}
}