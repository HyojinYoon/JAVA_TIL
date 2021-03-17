package test.day0317;

public class ObjectEx03 
{
	public static void main(String[] args) 
	{
		// 변수 선언
		Tv t; // 지역 참조형 변수(주소) 선언 / Tv클래스의 타입 - 내가 만드는 것. (ex.ch, vol-정수2개, power-논리1개)
			  // 모든 참조형 변수는 숨겨진 11개의 메소드/데이터가 있다.
		int a; // 지역 기본형 변수(값) 선언 / int 타입 - 정수만 대입 가능
		/* 선언만 했을 때에는 아무 것도 없는 상태 */
		
		// 변수는 생성(값 대입) 후 사용한다.
		t = new Tv();
		
		Tv t2 = t; // t와 t2가 같은 주소를 사용하게 됨.
		
		t.channel = 77;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2.channel = 88; // 같은 주소이기 때문에 t2에 값을 넣으면 t에도 적용.
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		System.out.println(t);
		System.out.println(t2); // t, t2 주소 동일
		
		/* 생성자 오버로딩
		Tv(int a, long b){}
		Tv(long a, int b){}
		Tv(long a, double b){
		
		Tv t3 = new Tv(200);
		Tb t4 = new Tv(100L, 200);
		Tv t5 = new Tv(100L, 20.0); */
	
	}
}
