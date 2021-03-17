package test.day0317;

//API용 (=부품)

// Tv 설계도 제작
// 기능 - 전원 / 채널 / 소리 ==> 변수로 제작
public class Tv {
	boolean power = false; // 전원 - 켜고 끄는 것만 있기 때문에.
	int channel = 1; // 채널
	int volume = 0; // 소리
	Tv(){ // Tv 생성자 - 메모리에 올라가지 않음
		channel = 100;  // 생성자에서 채널에 100이 들어갔기 때문에 int channel의 1은 의미가 없음

	}
}
