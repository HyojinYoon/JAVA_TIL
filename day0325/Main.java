package test.day0325;
//����
public class Main {
	public static void main(String[] args) 
	{
		try { // ���ܹ߻� ���� ���� - ���ܹ߻� �� catch() ȣ��
			int [] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			//System.out.println(a[3]); //���� �߻� - ���� �� �߻��ϴ� ����
		
			Main m1 = null; // �ڱ� Ŭ������ ��ü ����
			System.out.println(m1);
			System.out.println(m1.toString()); //-> ���� �߻� - null�ε� .�� ����� ������ �� �߻��ϴ� ����
		}
		catch(Exception a) { // Exception�� Array~�� NullPoint~�� �����̱� ������ Exception���� �� �ٸ� catch ����
			System.out.println("���� ó��!!" + a.getMessage()); //���� ���� �޼����� �Բ� ���
			a.printStackTrace(); // ��� �߻��Ǿ����� ǥ��
		}
		
	/*	catch(ArrayIndexOutOfBoundsException a) // ó���� ���� Ŭ���� ����
		{ //���� �߻��� �κп��� catch�� �Ѿ��.
			System.out.println("�迭 �ε��� ���� ó��!!");
		}
		catch(NullPointerException a){
			System.out.println("��ü�� �������� �ʾҽ��ϴ�.");
		} */
		
	}	
}
