package test.day0318;

public class MethodEx01 {
	public static void main(String[] args) {
		Test t = new Test ();
		t.add(); // 호출(실행) - add 메서드를 실행하시오.
		
		int x = t.sum(); // 10이 같이 돌아옴.
		
		System.out.println("x");
		System.out.println("main 종료");
		
		t.aaa(50); // 매개변수의 값을 넣어줘야 함. -> x에 50 대입
		
		t.aaa(200);
		
		t.bbb(10, 20);
		int a = 100;
		int b = 200;
		t.bbb(a, b);
		
		t.ccc(100, "hello");
		
		int y = t.ddd(2, 5);
		System.out.println(y);
	}
}
