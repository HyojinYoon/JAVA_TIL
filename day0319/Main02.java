package test.day0319;

public class Main02 { // 메서드
	public static void main(String[] args) {
		//add 메서드를 호출하시오!
		add(); // 같은 클래스 안에 있어서 이름 생략 가능.
		Main02.add(); // 생략하지 않는 것이 좋음.
		
		int x = bbb() + 100; // 1.메서드호출 2.10+100 3.x에 대입
		System.out.println(x);
		
		Test t = ccc(); //ccc는 리턴타입이 Test이기 때문에 Test객체에 대입
		System.out.println(t); // -> Test클래스의 주소 출력
		System.out.println(t.x); // 200 , Test클래스의 int x = 200;
	}
	
	static Test ccc() {  // -> Main 클래스의 Test클래스
		Test t1 = new Test(); // -> 리턴타입도 참조형이 될 수 있음
		return t1;
	}
	
	static int bbb() {
		return 10; // int는 리턴값이 정수로 꼭 있어야함! bbb를 호출하면 10이 호출한 곳으로 돌아감.
	}
	
	static void add() { // void - 리턴 값이 없음
		System.out.println("클래스 메서드");
	}
}
