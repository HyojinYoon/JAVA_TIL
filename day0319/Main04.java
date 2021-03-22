package test.day0319;

public class Main04 { // final = 상수
	// 상수 이름은 모두 대문자로 한다!!
	
	// 초기화 방법 3가지 중 한가지만!!! 이용하여 값 변경 가능.
	final static int x = 100; // -> 이미 명시적 초기화로 값을 대입한 것
	final int y; // -> 아직 초기화가 이루어지지 않은 상태
	
	{
		y = 300; // -> 블록 초기화로 대입 사용
	}
	
	/*Main04(){
		y = 400;  -> 블록 초기화에서 값을 대입했기 때문에 생성자 사용 불가
	}*/
	
	public static void main(String[] args) {
		
		final int x = 10; // 처음 값 대입 후 다른 값 대입 불가 ex)ID
		/*x = 20;
		  x = 30; */ 
		
		final int age = 20; 
		final int AGE = 20; // 상수의 이름은 대문자로 지정해주기!!
		
		int y = x; 
		int z = y + x; 
		
		// x++; -> 값이 직접적으로 바뀌기 때문에 사용 불가
		// x+=2; -> 값이 직접적으로 대입되는 것은 사용 불가
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
