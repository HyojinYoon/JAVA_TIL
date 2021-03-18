package test.day0318;

public class Calc {
	// 오버로딩 - 이름이 같으며 , 매개변수 갯수, 타입, 순서로 구별한다.
	
	int sum(int x, int y)
	{
		int result = x+y;
		return result; // return은 하나의 결과 값만 전송 가능.
		// return x+y;  간단하게 사용해도 됨
	}
	double sum(double x, double y)
	{
		return x+y;
	}
	double sum(int x, double y)
	{
		return x+y;
	}
}
