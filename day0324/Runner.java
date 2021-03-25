package test.day0324;

public class Runner implements Runable , Startable {
	// 클래스 이름 뒤에 나오는 모든 것들은 조상

	int speed = Startable.INDEX;
	//Runable 오버라이딩
	public int speed() {
		if(speed <= Runable.MAXSPEED ) {
		speed += 10;
		}
		return speed;
	}
	//Startable 오버라이딩
	public void name() {
		System.out.println("홍길동");
	}
	

}
