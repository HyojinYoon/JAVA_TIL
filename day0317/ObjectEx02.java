package test.day0317;

public class ObjectEx02 {
	public static void main(String[] args) {
		// ��ü ���� - ������ ���� ������ ��ģ ��!
		Tv t1 = new Tv();
		
		new Tv(); // new �޸� ���� �� �ʱ�ȭ �۾�
		/* new-> Tv Ŭ������ ������ �޼ҵ带 �޸𸮿� ����
		         Tv Ŭ������ �����ڴ� �޸𸮿� ���� ����  */
		          // Tv() �� ������ ����
		
		System.out.println(t1.channel); // -> 100 (�����ڱ��� ���ԵǱ� ����)
		
		Car c1 = new Car();
		Car c2 = new Car("red"); // -> red�� Car Ŭ������ String c�� ���ԵǴ� ��
		Car c3 = new Car("blue", 200); // -> 2��¥�� �����ڿ� ���Ե�
		// Car c4 = new Car(100, "yellow"); -> ����. ������ ���� ����.
		// Car c5 = new Car(200); -> ����. Ÿ���� ���� ����.
		// Car c6 = new Car("red", 200, 200); -> ����. ���� ���� ����.
		
		System.out.println(c1.color); // -> black
		System.out.println(c2.color); // -> red
	}
}
