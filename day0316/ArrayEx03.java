package test.day0316;

public class ArrayEx03 {
	public static void main(String[] args) 
	{
		int [] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int [] num2 = {10,20,30}; //�����ϰ� �����ϴ� ���
		
		for(int a = 0; a < num2.length; a++) {
			System.out.println(num2[a]);
		}
		
		//���� for�� 
		/* �ݺ� Ƚ���� ������ �� ����.
		   �迭�� ũ�⸸ŭ �ݺ� */
		//for( ���Թ��� �� : �迭�̸� ) {		}
		for(int a : num2) //�迭 ������� a�� ���ԵǴ� ��. [0]����, [1] ����, [2] ����
		{
			System.out.println(a);
		}
	}

}
