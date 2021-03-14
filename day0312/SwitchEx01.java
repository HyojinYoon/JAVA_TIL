package test.day0312;

public class SwitchEx01 
{
	public static void main(String[] args) 
	{
		int x = 10;
		switch(x) //조건식의 결과는 int. (x+10)처럼 연산으로 들어가도 됨.
		{
			case 10 ://int x = 10 경우, case 10을 찾아가서 그 이후 값들 모두 출력됨.
				System.out.println(10);//..코드 작성
			case 20 :
				System.out.println(20);//..코드 작성
				break; //뒤의 값들이 더 안나오길 바랄 때. switch문 종료.(case를 한 영역처럼 사용 가능. case~break; case~break;)
			case 30 ://int x = 30 경우, case 30을 찾아가서 그 이후부터 출력됨.
				System.out.println(30);//..코드 작성
			default : //case가 없으면 default 값 출력 , default는 마지막에 위치하지 않아도 됨.
				System.out.println(100);//..코드 작성
				
			/*case 1,2,3: 으로 사용은 x
			switch("hello") { case "hello" :  ->JAVA ver.1.7 이상부터 가능.(cmd창에 java -version으로 확인, 제어판에서 확인)
			case 10 : case 11 : case 12 : case 13 : case 14 : 사용 가능.*/
		}
	//switch문 안에 switch문 사용x. switch문 안에 if문도 사용x. (문법적으로는 가능)
	}
}
