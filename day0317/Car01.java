package test.day0317;

public class Car01 {
	String color;
	int speed;
	int door;
	Car01(){
		this("black", 150, 4); // �� �ٿ� this �� �� ���� �ۼ� ����. this�� ������ ��, ù ��!
	
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
