package test.day0317;

public class ObjectEx01 
{ //�����
	public static void main(String[] args) 
	{
		Tv t1 = new Tv(); //tv ���� . �ּҿ� false / 1 / 0 ���� �޸� ����
		// t1�� �ּҰ� ����
		
		// t1 ������ ����� �ּ��� channel ���
		System.out.println(t1.channel); // -> 1
						  // . - �˰� �ִ�, �����ϰ� �ִ�
		
		t1.channel = 10; // t1�� �˰� �ִ� channel�� 10�� �����ض�
		System.out.println(t1.channel); // -> 10
		System.out.println(t1.power);
		System.out.println(t1.volume);
		
		
		Tv t2 = new Tv();
		t2.channel = 50; // t1�� t2�� �ּҴ� �ٸ�. �� �ٸ� Tv�� ������ ��.
		
		//System.out.println(channel); -> ����. ��� Tv���� channel���� ��� �ʿ�.
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
	}
}
