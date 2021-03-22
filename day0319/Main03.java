package test.day0319;// 초기화

class Tv{
	//int channel; //클래스,인스턴스 기본값 적용 = 0
	int channel = 10; // 명시적 초기화
	static int volume = 100; // 명시적 초기화
	
	{ // 인스턴스 초기화 블록 -- 사용되지 않음
		channel = 20; // -> 명시적 값이 의미가 없어짐.
	}
	static { // 클래스 초기화 블록 - 실행 시 딱 한 번만 동작
		volume = 200;
		System.out.println("클래스 블록"); // 제일 먼저 출력됨
	} 
	
	{
		System.out.println("인스턴스 블록");
	}
	
	
	Tv(){ // 생성자 - 최종 수행되는 값
		System.out.println("생성자");
		channel = 30; // -> 명시적, 블록 값이 의미가 없어짐.
	}
}

public class Main03 { 
	public static void main(String[] args) {
		int x; // 지역변수 - 기본값 적용 안됨
		// System.out.println(x); - x에 아무런 값도 없어서 오류발생
		Tv t1 = new Tv(); 
		Tv t2 = new Tv(); // Tv의 channel에는 10이 있음 = 초기값.초기화값
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}
