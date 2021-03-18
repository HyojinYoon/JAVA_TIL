package test.day0318;

public class ClassEx01 {
	public static void main(String[] args) 
	{
		System.out.println(Tv.volume); // 같은 패키지의 다른 클래스에 잇는 것 출력 (클래스명.변수명)
		// System.out.println(Tv.channel); -> channel은 인스턴스라서 바로 출력 불가
		Tv.sum(); // 클래스 메서드 호출
		
		Tv t = new Tv(); // 인스턴스는 객체 생성 후 사용 가능
	/*  참조변수     객체    */
		System.out.println(t.channel);
		t.add();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 10;
		t2.channel = 20;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		Tv.volume = 30;
		System.out.println(Tv.volume);
		System.out.println(t1.volume); // 인스턴스처럼 사용은 가능 - t1과 t2에 따라 개별적으로 생성된 것이 아님.
		System.out.println(t2.volume);
		
		t1.volume = 70;
		System.out.println(Tv.volume); // -> 70
		System.out.println(t1.volume); // -> 70
		System.out.println(t2.volume); // -> 70
	}
}



// 정적 멤버를 많이 사용하면 좋을까??? XXX - 메모리를 많이 잡아먹음.