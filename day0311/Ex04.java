package test.day0311;

public class Ex04 
{
	public static void main(String[] args) 
	{
		int a = 5;
		double b = a; //5�� double�� �����Ѵٴ� �ǹ�. �Ǽ��� �Ҽ��� 1�ڸ��� ǥ��=5.0���� ��µ�
		//double b = (double)a;�� ��� ��.
		System.out.println(a);
		System.out.println(b);

		double x = 5.7;
		int y = (int)x; //�޸� ũ�Ⱑ double�� 8byte, int�� 4byte�� 4byte�� 8byte�� ����Ǵ� ���̶� ���� �߻�
				//(int) : 8->4�� ���鼭 4��ŭ ������ �ս��� �Ͼ�� ������ �����϶�� �ǹ� ex.5.7->5�� 0.7�ս�
		System.out.println(x);
		System.out.println(y);
		
		char i = 'a'; //char�� 2byte
		int j = i; //int�� 4byte
		//double j = i; //double�� 8byte , 97.0���� ��µ�
		System.out.println(i);
		System.out.println(j); //a�� �ƽ�Ű�ڵ忡 ���� ���ڷ� ����Ǹ� 97
		
		double aa = 65.9;
		char bb = (char)aa; //2byte=8byte�̱� ������ (char) �Է�
		System.out.println(aa);
		System.out.println(bb); //0.9�� ������� 65�� ���Ƽ� �׿� �ش��ϴ� ���� A�� ���
		
		aa=bb; //������ �̹� 0.9�� ���ư� ��Ȳ�̱� ������ 65�� ��. �ű⿡ �Ǽ��̱� ������ 65.0���� ����
		System.out.println(aa);
		System.out.println(bb);
		
		//boolean cc = true; //������ 1byte
		//int dd = cc; //int�� 4byte = 1byte ũ��� ������ but ������ �ٸ� Ÿ�Կ� ������ �� ����. �ܵ����θ� ��� ����
		
		
		
	}

}
