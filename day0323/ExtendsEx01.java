package test.day0323;
/*��� - �θ�Ŭ������ ����/�޼��带 ���� �޴´�.
	  - 1 : 1 ��Ӹ� �����ϴ�.
 	  - �����ڴ� ��ӹ��� ���Ѵ�.
 	  - ��ӹ��� �ʴ� ��� Ŭ������ ObjectŬ������ �ڵ���� �޴´�. */
public class ExtendsEx01 {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.x); // super ����
		System.out.println(s1.y); // super ����
		System.out.println(s1.z); // sub
		s1.add(); //super ���� �޼ҵ�
		s1.sum(); //sub �޼ҵ�
		
		//����������
		System.out.println(Super.a);
		System.out.println(Super.b);
		System.out.println(Super.c);
		//System.out.println(Super.d); - �ڱ� Ŭ���������� ����(private)
		
		//������ - ���󿡸� �ش� / ���� �ش��ϴ� �κи� ��� ����.
		Super s2 = new Sub(); // ���� ������ ���� = ������ �ڼ�
		// Sub s3 = new Super(); -> ���� (�ڼ� ���� = ���� ���� �� �Ұ���)
		/* Sub�� ��� ����(sub�� + Super��)�� �� ���Ƽ� Super�� ���� ������ ���� ����. */
		System.out.println(s2.x);
		System.out.println(s2.y);
	  //System.out.println(s2.z); // z�� super���� �ƴ� sub�� ����.
		
		// ������ �ڼ��� �����Ͽ� �������̵��� �޼��带 ����� �� �ִ�.
		// ������ ���������� �ڼ��� ��ü�� ������ �� �ִ�.
		// ��� �ڼ��� ��ü�� ������ �� �ִ�.
		s2.add(); // �ڼ� �޼ҵ� �������� �������̵� �Ǿ� ���
		
		Object obj = s2; // object���� ��� ��ü�� ���Ե� �� �ִ�.
		
		/*ex. int(����) / double(�ڼ�)
		 int x = (int)5.7; - 5�� ���� 0.7�� �ڼ� */
		
		Object obj1 = new Sub(); //Object�� ��� Ŭ������ ��ӹް� �ִ� �ְ� ����(obj -> super -> sub)
		Object obj2 = new Super();
		
	
	}
}
