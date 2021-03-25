package test.day0324;
//중첩 클래스(이너클래스)
public class Inner {
	
	class A { // 인스턴스 클래스 - 클래스 변수 사용 불가.
		      // 클래스 상수(final)만 가능.
		static final int xx = 100; // 상수 가능
		// static int yy = 200; -> 변수 사용 불가.
		int k = 500;
	}
	static class B{ // 정적(static) 클래스 - 내부 클래스이기 때문에 static 가능
		static int x = 100;
		int y = 200; // 인스턴스 변수
	}
}
