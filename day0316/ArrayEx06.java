package test.day0316;

public class ArrayEx06 
{
	public static void main(String[] args) 
	{
		// 배열 만드는 1번 방식 
		int [] x = new int[3]; //변수와 다른 점 : new로 새로운 메모리를 만듦. new를 이용하여 여러 개의 메모리 생성 가능.
		x[0] = 10; //각 방은 변수처럼 사용 가능. ex) x[0]++;
		x[1] = 20;
		x[2] = 30; 
		
		// 배열 만드는 2번 방식 - 주사용법
		int [] y = {10,20,30}; 
		
		x[0] = y[2]; // x의 0번째에 y의 2번째를 대입해라.
		
		int a = 100;
		y[0] = a; // a의 값을 y[0]에 대입해라.
		
		/*배열은 변수의 이름이 특이한 것으로 이해해도 됨*/
				
		System.out.println(x[0]);
		System.out.println(y[0]);
	}
	
}
