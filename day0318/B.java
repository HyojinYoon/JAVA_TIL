package test.day0318;

public class B {
 /* 로딩 순서대로 진행 - 1. 클래스 2. 정적멤버 3. 인스턴스 멤버(new 사용 시)
    위에서 아래로 실행되는 것이 아님(위에서 아래로 - 메서드, 생성자) */
	static int x = 100;
	static int y = x;
	
	static int a = 100;
		   int b = a;
	
   /* int m = 100;
    static int n = m; -> 위에서 아래로 동작하는 것이 아니라, 정적 멤버가 먼저 실행됨 */
	int m = n;
	static int n = 100; 
	
	//정적 / 인스턴스
	static int p = 10;
	int q = 200;
	static void method( ) {
		System.out.println(B.a);
		// System.out.println(q); - 불가능
	/* 인스턴스 멤버는 클래스 멤버를 사용할 수 있다.
		클래스 멤버는 인스턴스 멤버를 사용할 수 없다. */
	}
	void instance() {
		System.out.println(B.a);
		System.out.println(q); // 인스턴스 멤버는 클래스 멤버 사용 가능.
	}
	
}
