package test.day0324;

public class Runner implements Runable , Startable {
	// Ŭ���� �̸� �ڿ� ������ ��� �͵��� ����

	int speed = Startable.INDEX;
	//Runable �������̵�
	public int speed() {
		if(speed <= Runable.MAXSPEED ) {
		speed += 10;
		}
		return speed;
	}
	//Startable �������̵�
	public void name() {
		System.out.println("ȫ�浿");
	}
	

}
