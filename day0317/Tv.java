package test.day0317;

//API용 (=부품)

// Tv 설계도 제작
// 기능 - 전원 / 채널 / 소리 ==> 변수로 제작
public class Tv {
	boolean power = false; // 전원 - 켜고 끄는 것만 있기 때문에.
	int channel = 1; // 채널
	int volume = 0; // 소리
	int inch = 55;
	
	// 모든 클래스는 최소 1개 이상 생성자를 갖는다.
	// 생성자가 하나도 없으면 컴파일러가 자동으로 내용이 비어있는 기본생성자를 추가한다.
	// 기본 생성자 - 매개변수가 없는 생성자 
	// 생성자가 여러 개일 때 - 매개변수 갯수, 순서, 타입으로 구별.
	Tv(){
		channel = 100;  // 생성자에서 채널에 100이 들어갔기 때문에 int channel의 1은 의미가 없음
	}
	Tv(int c){
		channel = c;
	}
	Tv(int a, int b){
		channel = b;
	}
	Tv(int a, double b){
		channel = a;
	}
}
