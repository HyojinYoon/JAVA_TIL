package test.day0317;

public class ObjectEx02 {
	public static void main(String[] args) {
		// 객체 생성 - 생성자 까지 동작을 마친 것!
		Tv t1 = new Tv();
		
		new Tv(); // new 메모리 생성 및 초기화 작업
		/* new-> Tv 클래스의 변수와 메소드를 메모리에 생성
		         Tv 클래스의 생성자는 메모리에 들어가지 않음  */
		          // Tv() 로 생성자 동작
		
		System.out.println(t1.channel); // -> 100 (생성자까지 삽입되기 떄문)
		
		Car c1 = new Car();
		Car c2 = new Car("red"); // -> red가 Car 클래스의 String c에 대입되는 것
		Car c3 = new Car("blue", 200); // -> 2개짜리 생성자에 대입됨
		// Car c4 = new Car(100, "yellow"); -> 에러. 순서가 맞지 않음.
		// Car c5 = new Car(200); -> 에러. 타입이 맞지 않음.
		// Car c6 = new Car("red", 200, 200); -> 에러. 수가 맞지 않음.
		
		System.out.println(c1.color); // -> black
		System.out.println(c2.color); // -> red
	}
}
