package test.day0315;

public class ForEx04 
{
	public static void main(String[] args) 
	{
		// 1~100 까지의 합을 출력하시오.
		for(int a = 1; a < 101; a++)
		{
			System.out.println(a);
		}
		//정답
		int sum = 0;
		for(int x = 1; x <= 100; x++)
		{
		  // sum = sum + x; //0+1, 1+2, 3+3, 6+4 ....
			sum += x;
		}
		System.out.println(sum);
		
		// 1~100까지의 짝수의 합 출력하시오.(2550)
		sum = 0;
		for(int x = 2; x <= 100; x+=2) //for문안에서 변수 선언을 했기 때문에 동일한 변수이름 사용 가능.
		{
			sum += x;
			System.out.println(x);
		}
		System.out.println(sum);
	
		// 홀수,짝수 구별하기 - /2를 했을 때 나머지 값이 무엇이냐에 따라 구별 가능.0-짝수, 1-홀수
		
		for(int x = 0; x <=100; x++)
		if(x % 2 == 0) // 사칙연산자 > 비교연산자, % - 나머지 구하는 연산자
		{
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		// 1~100까지 100번 반복
		// 홀수의 합 / 짝수의 합 출력
		// 출력 결과 ==> 짝수 : 2550 홀수 : 2500
		
		int odd = 0; // 홀수 합 저장
		int even = 0; // 짝수 합 저장
		for(int x = 1; x <=100; x+=2)
		{
			odd += x;
		}
		for(int y = 2; y <=100; y+=2) 
		{
			even += y;
		}
			System.out.println("짝수 : "+ odd +" 홀수 : "+ even);
	
		/* etc */
		int aa = 0; //홀수 합 저장
		int bb = 0; //짝수 합 저장
		for(int x = 1; x <=100; x++) 
		{
			if(x % 2 == 0)
				bb += x;
			else
				aa+=x;
		}
		System.out.println("짝수 : "+ aa +" 홀수 : "+ bb);
	}	
}
