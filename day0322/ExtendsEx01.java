package test.day0322; // ���

/*class A (extends object){ �� object�κ��� ��ӹ޴´ٴ� ������ �����Ǿ� �ִ� ��
  object Ŭ���� : �ֻ��� Ŭ�����̸� ��� Ŭ������ ��ӹ޴´�
  				�ż��常 ������ ����
  				- ����� ���� �ʴ� Ŭ������ �ڵ����� ��ӵȴ�.
  */
class A { // ����, �޼���, ������ - ������ �޼��常 ��� ����
	int x = 100; // **���������ڰ� private�� ��� �Ұ���.
	int y = 200;
	A(){} // �⺻������
	A(int x, int y){ // �Ű������� 2���� ������
		this.x = x;
		this.y = y;
	}
}

//A - �θ�(����)
//B - �ڽ�
class B extends A{ // BŬ������ A�� ��ӹ޾Ҵ�. A�� B�� ����Ŭ����.
	int y = 300;
	int z;
	B(){ //������
		//super(); // ������ ������ ȣ��. - ù�ٿ� ���. (this() - �ڽ��� ������ ȣ��)
		super(500,600); // ������ ������ ȣ��.
		this.z = super.y; //�̸��� ��ġ�� ������ ��ü�� super�� ����.(super - �����ּ�, this - �ڽ��ּ�)

	}
}

// ��� Ŭ������ �ϳ��� ����� ���� �� ����.(ex. B�� A, S �� ���� ����� �Ұ���-���迬��� ��Ӱ��� S-A, A-B)


public class ExtendsEx01 {
	public static void main(String[] args) {
		B b = new B(); // B��ü�� �����ص� x, y ��� ��� - ��ӵǾ� �ֱ� ������.
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);


	}
}
