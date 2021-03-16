package test.day0316;

public class ArrayEx03 {
	public static void main(String[] args) 
	{
		int [] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int [] num2 = {10,20,30}; //간단하게 삽입하는 방법
		
		for(int a = 0; a < num2.length; a++) {
			System.out.println(num2[a]);
		}
		
		//향상된 for문 
		/* 반복 횟수를 지정할 수 없음.
		   배열의 크기만큼 반복 */
		//for( 대입받을 값 : 배열이름 ) {		}
		for(int a : num2) //배열 순서대로 a에 대입되는 것. [0]대입, [1] 대입, [2] 대입
		{
			System.out.println(a);
		}
	}

}
