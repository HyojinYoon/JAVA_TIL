package test.day0324;

public class InnerMain01 {
	public static void main(String[] args) {
		//method() ȣ��
		Inner01 i = new Inner01();
		Inner01.B b = i.new B();
		b.method();
		
		i.add();
		
		
		//�͸� Ŭ����
		//new �����(){�������̵�};
		/*�͸�Ŭ������ Runable �������̽��� �����Ѵ�! */
		Runable r1 = new Runable() {
			public void name() {
				System.out.println("�͸�Ŭ���� - �������̵�");
			}
		};
		
		r1.name();
		
		//�͸�Ŭ������ object Ŭ���� ���!!
		Object obj = new Object () {
			public String toString() {
				return "�͸�Ŭ����";
			}
		};
		System.out.println(obj);
	}
}
