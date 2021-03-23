package test.day0323;
/*상속 - 부모클래스의 변수/메서드를 복사 받는다.
	  - 1 : 1 상속만 가능하다.
 	  - 생성자는 상속받지 못한다.
 	  - 상속받지 않는 모든 클래스는 Object클래스를 자동상속 받는다. */
public class ExtendsEx01 {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.x); // super 조상
		System.out.println(s1.y); // super 조상
		System.out.println(s1.z); // sub
		s1.add(); //super 조상 메소드
		s1.sum(); //sub 메소드
		
		//접근제한자
		System.out.println(Super.a);
		System.out.println(Super.b);
		System.out.println(Super.c);
		//System.out.println(Super.d); - 자기 클래스에서만 가능(private)
		
		//다형성 - 조상에만 해당 / 조상에 해당하는 부분만 사용 가능.
		Super s2 = new Sub(); // 변수 선언은 조상 = 생성은 자손
		// Sub s3 = new Super(); -> 오류 (자손 선언 = 조상 생성 은 불가능)
		/* Sub의 멤버 갯수(sub꺼 + Super꺼)가 더 많아서 Super가 충족 시켜줄 수가 없음. */
		System.out.println(s2.x);
		System.out.println(s2.y);
	  //System.out.println(s2.z); // z는 super값이 아닌 sub의 값임.
		
		// 조상이 자손을 참조하여 오버라이딩된 메서드를 사용할 수 있다.
		// 조상의 참조변수는 자손의 객체를 참조할 수 있다.
		// 모든 자손의 객체를 저장할 수 있다.
		s2.add(); // 자손 메소드 내용으로 오버라이딩 되어 출력
		
		Object obj = s2; // object에는 모든 객체가 대입될 수 있다.
		
		/*ex. int(조상) / double(자손)
		 int x = (int)5.7; - 5는 조상 0.7은 자손 */
		
		Object obj1 = new Sub(); //Object는 모든 클래스가 상속받고 있는 최고 조상(obj -> super -> sub)
		Object obj2 = new Super();
		
	
	}
}
