package test.day0311;

public class Ex01 {

	public static void main(String[] args) {
		// 변수 선언;
		// 타입 이름; (변수 이름도 첫글자에 숫자가 올 수 없음)
		int a; //int: -21억~21억까지 들어갈 수 있음, 가장 많이 사용(정수 기준)
		int b;
		byte c; //byte: -128~127까지 들어갈 수 있음(ex.200 삽입 불가)
		short d;
		long e;
		char f; // 정수
		float g; //실수(소수점 6자리까지)
		double h; //실수(소수점 16자리까지)(실수 기준)
		boolean i; //논리(0,1-2진수(10진수 아님)), 2진수 0,1로 인식할 수 있도록 true(1), false(0)로 사용
		
		//변수값 저장 (저장한다=대입한다)
		int j;
		j = 10; //j변수에 10을 대입한다(오른쪽에 있는 값을 왼쪽에 대입해라)
				//==는 비교, =는 대입
		j = 20; //변수는 1개만 저장(10은 사라지고 20으로 대입됨)
		
		double k;
		k = 5.5;
		boolean l;
		l = true; //true=1
		char m; //문자가 삽입될 수 있음
		m = 10;
		char m1;
		m1 = 'A'; // 'AA'두 글자는 불가 (홑따옴표 안에 삽입)
		
		int o = 100; //선언과 대입을 한 번에 해도 됨 (기본적으로 쓰이는 방식)
		double p = 5.7;
		boolean q = false;
		
	}

}
