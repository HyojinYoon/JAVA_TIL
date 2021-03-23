package test.day0323;
// 조상
public class Super {
	int x;
	int y;
	
	Super(){ // 기본생성자 - 매개변수가 없는 생성자
		this(100,200); // 자신의 다른 생성자 호출!
		/*x = 100;
	      y = 200; */
	}
	
	Super(int x, int y){
		this.x = x;
		this.y = y;
	}	
	
	void add() { //메소드
		System.out.println("Super 조상");
	}
	
	//접근제한자
	//모두
	public static int a = 100; 
	//같은 패키지, 다른 패키지의 자손
	protected static int b = 100; 
	//같은 패키지
	 		  static int c = 100;
	//자기 클래스
	private static int d = 100;
}
