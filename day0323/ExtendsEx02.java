package test.day0323;
//������
public class ExtendsEx02 { 
	public static void main(String[] args) {
		Super su = null; // null-�ּҰ� ����
		Sub s1 = new Sub();
		Sub s2 = null;
		
		su = s1; // s1�� su�� ���� ==> su = (Super)s1;
		su.add(); // add�� ���� ����
		//su.sum(); // sum�� �ڼղ�
		
		// ���� = �ڼ� // �ڼ� = ����(X)
		s2 = (Sub)su; // �ڼ� = ���� ��� �� (Sub) ��÷� sub ���.
		s2.add();
		s2.sum();
		
		s1.x = 0;
		s2.sum();
	}
}