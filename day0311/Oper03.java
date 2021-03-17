package test.day0311;

public class Oper03 
{
	public static void main(String[] args) 
	{
		char c = 'A'; // 한 글자
		
		// 정수, 실수, 논리 ==> 기본형데이터 타입
				// String ==> 참조형데이터 타입
				// 문자열 (+) 사용하여 변수를 연결할 수 있음.
		
		int x = 10;
		int y = 20;
		String s = "hello"; // 문자열
		System.out.println(x);
		System.out.println("x변수 값="+x); //string+int=string(문자열) , +만 가능(연결한다는 의미)
		System.out.println(x+" "+y);
		System.out.println("x+y="+x+y); //출력된 값은 모두 string
		System.out.println("x+y="+(x+y));
		System.out.println(x+"+"+y+"="+(x+y)); //'+'로 홑따옴표를 사용하면 char로 인식되어 숫자로 연산이 됨.
		
		String a = "60";
		int b =60;
		System.out.println(a+b); //a는 string이기 때문에 6060으로 출력
		
		//char c = 'A'; //65  *-1이 나오는 경우, 문자가 없다는 의미 ex.문서의 끝임을 알려줄 때 -1을 표시

		//스페셜문자, 이스케이프 문자 ==> 특수문자
		System.out.println("\"hello\""); // \를 넣어서 넣고 싶은 특수문자 삽입
		System.out.println("\'hello\'");
		System.out.println("\\hello\\");
		System.out.println("\thello"); // \t는 tab
		System.out.println("hello\n world"); // \n은 줄바꿈 , 리눅스 \n
		System.out.println("hello\r world"); // \r도 줄바꿈 , 윈도우 \r
		/* \n, \r 줄바꿈 비정상적으로 작동할 수 있음(운영체제 차이) \r\n 운영체제에 상관없이 줄바꿈을 하기 위해 함께 사용 */	
	}
}
