package test.day0317;

public class ObjectEx01 
{ //실행용
	public static void main(String[] args) 
	{
		Tv t1 = new Tv(); //tv 생성 . 주소에 false / 1 / 0 으로 메모리 생성
		// t1에 주소가 대입
		
		// t1 변수에 저장된 주소의 channel 출력
		System.out.println(t1.channel); // -> 1
						  // . - 알고 있다, 포함하고 있다
		
		t1.channel = 10; // t1이 알고 있는 channel에 10을 대입해라
		System.out.println(t1.channel); // -> 10
		System.out.println(t1.power);
		System.out.println(t1.volume);
		
		
		Tv t2 = new Tv();
		t2.channel = 50; // t1과 t2의 주소는 다름. 또 다른 Tv가 생성된 것.
		
		//System.out.println(channel); -> 오류. 어느 Tv안의 channel인지 명시 필요.
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
	}
}
