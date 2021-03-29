package test.day0326;

public class Tv { 
	int channel = 88;
	
	Tv(){ // 기본 생성자
		channel = 55; //현재 만들고 있는 객체에 55를 넣겠다. 88이 있던 곳에 다시 55가 들어감.
	}
	Tv(int channel){ // 매개변수가 하나인 생성자
		this.channel = channel;
	}
	/* Tv t1 = new Tv();   => 기본생성자 호출
	   Tv t2 = new Tv(500); => 매개변수 int channel에 500을 넣어 호출 */
	
}

 