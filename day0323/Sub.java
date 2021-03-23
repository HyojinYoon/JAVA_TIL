package test.day0323;

public class Sub extends Super{ // 상속
	int x;
	int z;
	
	Sub(){ // 생성자
		super(700, 800); // 조상의 생성자를 호출해서 대입
		this.z = 300;
		//this(300); // 자기 생성자 호출(super/this는 같이 사용 불가.첫 줄에 와야하는 특징)
		//this.x = 700; // 자손에서 조상의 변수를 초기화(추천하는 방식은 x)
		this.y = 800;
	}
	Sub(int z){
		this.z = z;
	}
	//메서드 오버라이딩 (덮어씌우기)
	// 리턴타입 / 이름 / 매개변수는 똑같이 하며, 메서드 내용만 변경하는 것
	void add() { //조상과 똑같은 add 이름의 메서드 - 메서드는 this, super로 구별 불가 => 자손이 덮어씌우기 효과 **오버라이딩
		System.out.println("오버라이딩 Sub 자손");
	}
	public void add(int x) { // 오버로딩
		
	}
	
	void sum() { //메서드
		int x = 10; // 지역변수
		System.out.println(x); //지역변수꺼 / 지역변수가 없을 때에는 this.x값으로 나옴. this.x가 없을 때에는 super에 있는 x 값.
		System.out.println(super.x); //Super 조상꺼
		System.out.println(super.y); //Super 조상꺼 
		System.out.println(this.x); //Sub 자식-자신꺼
		System.out.println(this.z); //sub자식-자신꺼라서 this
	}
}
