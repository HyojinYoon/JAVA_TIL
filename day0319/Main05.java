package test.day0319; // import, ���� ������
import pro.ex.Hello;

public class Main05 {
	public static void main(String[] args) {
		//pro.ex ��Ű�� - hello Ŭ���� ����ϱ�
		//�ٸ� ��Ű�� Ŭ���� ��� ��, Ŭ������ Ǯ������ �ۼ��ؾ� �Ѵ�.
		
		// Hello h = new Hello(); -> Ŭ������ ��� �Ұ�
		pro.ex.Hello h1 = new pro.ex.Hello();
		System.out.println(h1); // -> HelloŬ������ �ּ� ���
		
		/* ��ܿ� import�� ����� ��Ű�� �� Ŭ���� �̸��� �����صθ� */
		Hello h = new Hello(); // Ŭ������ ��� ����
	// 	System.out.println(h1.msg); -> ���� ������ ������ ���� ��� �Ұ�
		System.out.println(h.msg); // hello Ŭ������ public ���������� ����߱� ������ ��� ����
		
	/*  System.out.println(h.x); // protected : ���� ��Ű��������. �ٸ� ��Ű���� ����
		System.out.println(h.y); // default : ���� ��Ű��������. �ٸ� ��Ű���� ����
		System.out.println(h.z); // private : �ش� Ŭ����������. �ٸ� Ŭ������ ����  */
		
	}

}
