package test.day0323;

//������ - �迭�� ��ü ����
public class polyEx01 {
	public static void main(String[] args) 
	{
		int [] a = new int[3]; //�⺻�� �迭 (�⺻�� 0 0 0 )
		Super [] s = new Super[3]; //������ �迭 (�⺻�� null null null)
		
		s[0] = new Super();
		s[1] = new Super();
		s[2] = new Super();
		System.out.println(s); // ->[Ltest.day0323.Super;@4926097b =>L�� �迭�� �ּҶ�� �ǹ�
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println(s[0].x);
		/* Super s0 = new Super();
		   System.out.println(s[0].x); �� ����*/
	}
}
