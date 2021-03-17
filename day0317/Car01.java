package test.day0317;

public class Car01 {
	String color;
	int speed;
	int door;
	Car01(){
		this("black", 150, 4); // 한 줄에 this 로 한 번에 작성 가능. this는 생성자 내, 첫 줄!
	
		/*color = "black";
		speed = 150;
		door = 4; */
	}
	Car01(String c, int s, int d){
		color = c;
		speed = s;
		door = d;
	}

}
