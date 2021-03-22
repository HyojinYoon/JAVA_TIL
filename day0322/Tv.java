package test.day0322;

// 전원, 채널, 볼륨, 가로크기, 세로크기, 제품명
// 전원 - on/off => boolean
// 전원 - on/off/절전모드 => int(100 - on, 0 - off, 500 - 절전)
//						 String ("켜짐", "꺼짐", "절전")
// 채널 - 1,3,5,7,9,11,15,17,20,22,30,44,45,50 => int[] (int 배열로 사용)
// 볼륨 - 0~20 => int
// 크기 - int - 상수
// 제품명 - String ("LG", "SAM", "중소기업") - 상수

/*메서드 - Tv기능 만들기*/
// 전원 - power 변수의 상태를 반대로 변경한다.
// 채널 - 채널 올리기 - 마지막 채널인 경우 처음 채널로 변경 / 채널 내리기 - 처음 채널인 경우 마지막 채널로 변경
// 채널 - 입력값을 받아서 채널 변경 - 채널이 없는 경우 현재 채널 유지!
// 볼륨 - 올리기 - 최대 볼륨인 경우 변경되지 않는다.
// 음소거 - 볼륨을 0으로 만든다. / 음소거 해제 시 이전 볼륨 상태로 돌아간다.
// Tv 상태 출력 ex) brand-LG, 크기-(x*y), 전원-켜짐, 채널-11ch, 볼륨-10
// 채널, 볼륨 기능은 전원이 켜져있을 때만 동작한다.

public class Tv {
	private boolean power = false;
	private int [] channel = {1,3,5,7,9,11,15,17,20,22,30,44,45,50};
	private int indexCh = 0; //배열의 방번호 - 첫번째 값=0번방(1)
	private int volume;
	private int muteVol; // 음소거 전의 볼륨 값 넣을 변수
	private boolean mute = false; //음소거 여부
	public final int x; // 크기   -- 상수인데 초기화 안해서 엑박 뜨는 것(초기화 1가지 방법만)
	public final int y; // 크기
	public final String brand;
	public Tv() { // 기본생성자(매개변수가 없는 생성자)
		// 크기와 제품명을 정의한다.
		this(100,80,"LG"); // 생성자에서 다른 생성자 호출(첫줄!!)
		/*x = 100;
		  y = 80;
		  brand = "LG";  -> this로 간결하게 만들 수 있음 */
	}
	public Tv(int x, int y, String brand) {
		this.x = x; //명시적 초기화로 넣었으면 생성자에서 값 넣을 수 없음
		this.y = y;
		this.brand = brand;			
	}

	public void isPower(){  //논리형의 상태를 바꿀때 is를 많이 붙힘.
		this.power = !this.power; // 값을 반대로 바꿔서 대입해라
		if(this.power) { // this.power가 true 라면,
			System.out.println(this.brand+"Tv On");
		}
	}
	
	public void channelUp() { /*지역변수가 없기 때문에 this 생략가능*/
		if(this.power) { //전원이 on일 때만 동작해야하기 때문.
			if(this.indexCh == (this.channel.length-1)) { //length : 채널의 길이, 배열의 방 갯수 , index는 0부터 시작하기 때문에 length가 6일 경우 index는 0~5임.
				this.indexCh = 0;
			}else {
				this.indexCh++;
			}
			System.out.println("Ch." + this.channel[this.indexCh]); // 채널배열의 index
		}
	}
	
	public void channelDown() {
		if(this.power) {
			if(indexCh == 0) {
				indexCh = channel.length-1;
			}else {
				indexCh--;
			}
			System.out.println("Ch. "+ channel[indexCh]);
		}
	}
	
	public void channelChange(int ch) { // 원하는 채널로 이동
		if(this.power) {
			for(int i = 0; i < channel.length; i++) {
				if(channel[i] == ch) {
					indexCh = i;
					break;
				}
			}
			System.out.println("Ch. "+ channel[indexCh]);
		}
	}
	
	public void volumeUp() {
		if(this.power) {
			if(this.volume != 20) { //20까지만 올라갈 수 있기 때문에 20과 같지 않을 때까지만 올린다. = 19에서 올리는 것이 마지막.
				volume++;
			}
		}
	}
	
	public void volumeDown() {
		if(this.power) {
			if(this.volume != 0) {
				volume--;
			}
		}
	}
	
	public void isMute() {
		if(this.power) {
		this.mute = !this.mute;
		if(this.mute) {
			muteVol = volume;
			volume = 0;
		}else {
			volume = muteVol;
		   }
	    }	
	}
	public void print() {
		System.out.println(brand+" TV (" + x + "*" + y + ")");
		System.out.println("전원 - " + power);
		System.out.println("채널 - " + channel[indexCh]);
		System.out.println("음량 - " + volume);
	}
}				


