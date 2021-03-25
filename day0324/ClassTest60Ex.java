package test.day0324;
//�Ʒ� �߻�Ŭ���� Calculator�� ��ӹ��� MyCalc Ŭ������ �����ϼ���. 

abstract class Calculator {
	public abstract int add(int a, int b);			// �� ������ ���� ���Ͽ� ����
	public abstract int subtract(int a, int b);	// �� ������ ���� ���Ͽ� ����
	public abstract double average(int [] a);		// �迭�� ����� ������ ��հ��� ����
	
}

class MyCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		a = 100;
		b = 70;		
		return a-b;
	}

	@Override
	public double average(int[] a) { //a�� �迭
		double sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum / a.length ;
	}
}

public class ClassTest60Ex {
	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(100, 70));
		System.out.println(c.average(new int [] {2,3,4,5}));
		
	}
}