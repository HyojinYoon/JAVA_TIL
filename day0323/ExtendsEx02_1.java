package test.day0323;

public class ExtendsEx02_1 {
	public static void main(String[] args) {
		Super su = new Super(); // su�� Super �ڱ� ��ü�� ���� ������ ����� 3��
		
		// su��ü�� SubŬ������ ������ �� �ִ°��� Ȯ���ϴ� ��.
		if(su instanceof Sub) { // su - ��������, Sub - Ŭ����
			Sub s1 = (Sub)su;
			System.out.println("���� ����");
		}else {
			System.out.println("���� �Ұ���");
		}
		
		/* �ٷ� �������� ���� instanceof�� Ȯ�� �� �����ϴ� ���� ����*/
		Sub s1 = (Sub)su; // ���������δ� ����x. but, �ڼ��� 5���� �������Ѿ� �ؼ� ����.
		
		System.out.println(su);
		System.out.println(s1);
	}
}
