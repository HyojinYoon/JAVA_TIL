package test.day0317;

public class Main 
{
	public static void main(String[] args) 
	{
		// 객체 만드는 방법 - 같은 package에 있는 class 기준
		// 선언 => 클래스명 변수명;
		// 생성 => 변수명 = new 클래스명();
		// 클래스, 배열 = 참조형 데이터 타입
		Tv t;
		t = new Tv(); // Tv 생산! ==> tv 클래스에 파워, 채널, 볼륨 생성해놨기 때문에, 3개 메모리 생성
		Car c = new Car(); // Car 생산! ==> 컬러, 스피드 2개 메모리 생성
		Cls01 c1 = new Cls01();
		Main m = new Main();
		int [] a = new int [3];
		// 변수와 메서드 수 만큼 메모리가 구성됨.
		
		// 같은 설계도를 가지고 Tv를 3대 생산했다는 의미
		// tv1, tv2, tv3 => 참조변수(래퍼런스변수)  *참조변수 : 메모리의 주소 저장
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		Tv tv3 = new Tv();
		System.out.println(tv1); // -> test.day0317.Tv@5d22bbb7  *클래스이름(제품)@주소
		System.out.println(tv2); // -> test.day0317.Tv@41a4555e
		System.out.println(tv3); // -> test.day0317.Tv@3830f1c0
		
		// 첫글자가 대문자 = 클래스 ==> String도 클래스
		String s = new String(); 
	}
}
