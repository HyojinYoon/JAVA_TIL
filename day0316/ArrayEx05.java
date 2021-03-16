package test.day0316;

public class ArrayEx05 
{
	public static void main(String[] args) 
	{	//다차원 배열			행(가로) 열(세로)
		int [][] num = new int [3][2]; // 행 3줄, 열 2줄으로 생성 (행축 0,1,2 열축 0,1)
		num[0][0] = 100; //0열 0행 자리
		num[0][1] = 200; //0열 1행 자리
		num[2][1] = 300; //2열 1행 자리
		//[행][열] 두 개 모두 입력해줘야 함. num[0] = 100;은 불가능.
		
		int [][] num2 = {{10,20}, {30,40}, {60,70}}; // {0번 행 값}, {1번행 값}, {2번행 값}
						/* { {10,20},
						  	 {30,40},
						     {60,70} };   으로 세로 삽입도 가능*/
		
		// 가변배열
		int [][] num3 = { {10,20,30},
						  {30,40},
						  {60,70,80,90} };
		System.out.println(num[0][3]); // 에러메세지
		
		int [][] num4 = new int [3][]; //행의 갯수는 3개, 열의 갯수는 미완성
		num4[0] = new int [3];
		num4[1] = new int [2];
		num4[2] = new int [4]; //열의 갯수 완정
		
		//참조형 변수 = 주소
		int [] k = new int[3];
		
		//기본형 = 값
		int a = 100;
	}
}
