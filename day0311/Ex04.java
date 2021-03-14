package test.day0311;

public class Ex04 
{
	public static void main(String[] args) 
	{
		int a = 5;
		double b = a; //5를 double에 적용한다는 의미. 실수는 소수점 1자리를 표현=5.0으로 출력됨
		//double b = (double)a;로 적어도 됨.
		System.out.println(a);
		System.out.println(b);

		double x = 5.7;
		int y = (int)x; //메모리 크기가 double은 8byte, int는 4byte로 4byte에 8byte가 저장되는 것이라서 오류 발생
				//(int) : 8->4로 가면서 4만큼 정보의 손실이 일어나도 강제로 실행하라는 의미 ex.5.7->5는 0.7손실
		System.out.println(x);
		System.out.println(y);
		
		char i = 'a'; //char은 2byte
		int j = i; //int는 4byte
		//double j = i; //double은 8byte , 97.0으로 출력됨
		System.out.println(i);
		System.out.println(j); //a가 아스키코드에 따라 숫자로 변경되면 97
		
		double aa = 65.9;
		char bb = (char)aa; //2byte=8byte이기 때문에 (char) 입력
		System.out.println(aa);
		System.out.println(bb); //0.9가 사라지고 65로 남아서 그에 해당하는 문자 A로 출력
		
		aa=bb; //위에서 이미 0.9가 날아간 상황이기 때문에 65로 들어감. 거기에 실수이기 때문에 65.0으로 나옴
		System.out.println(aa);
		System.out.println(bb);
		
		//boolean cc = true; //논리형은 1byte
		//int dd = cc; //int는 4byte = 1byte 크기는 가능함 but 논리형은 다른 타입에 대입할 수 없음. 단독으로만 사용 가능
		
		
		
	}

}
