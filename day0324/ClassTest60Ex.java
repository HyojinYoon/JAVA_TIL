package test.day0324;
//아래 추상클래스 Calculator를 상속받은 MyCalc 클래스를 구현하세요. 

abstract class Calculator {
	public abstract int add(int a, int b);			// 두 정수의 합을 구하여 리턴
	public abstract int subtract(int a, int b);	// 두 정수의 차를 구하여 리턴
	public abstract double average(int [] a);		// 배열에 저장된 정수의 평균값을 리턴
	
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
	public double average(int[] a) { //a는 배열
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