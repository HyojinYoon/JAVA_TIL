package test.day0317;

public class ObjectEx04 {
	public static void main(String[] args) {
		Car01 c1 = new Car01();
		Car01 c2 = new Car01("red", 200, 2);
		
		// c1 / c2�� color / speed / door �� ����ϼ���.
		System.out.println(c1.color + " " + c1.speed + " " + c1.door);
		System.out.println(c2.color + " " + c2.speed + " " + c2.door);  // �����ؼ� ��� ����. �ϳ����� ��� ����.

	}

}
