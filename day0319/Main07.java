package test.day0319;

class Person{
	private String name; // �̸� - �̸��� �̻��� ���� ���⸦ ������ private(ex.����)
	private int age; // ���� 1~200���� �����ϱ� ���� �۾� - private
	
	// ��ȿ�� �˻� - ��ȿ�� ���� ���Դ��� �˻��ϴ� ��
	/* ������ �ϱ� ���� �޼��� = set�̶�� �տ� ���� */
	public void setAge(int age) { // ���� age�� ���� ������ ������ �޼ҵ� - ���� �����ϰ� ���̱� ������ void
		if(age > 0 && age < 200) { //&& �־��� ��� ������ true������.
		this.age =age; //int age�� ���� private int age ���� �����ض�
		}
	}
	public int getAge() { // -> ����� �������� ���ϸ� ���ִ� �޼���
		return age; // return age++; age--; ���� �۾� �� return ����
	}
}
public class Main07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
	
		p1.setAge(20); //20�� setAge�� ���Եǰ� private int age�� ����

	}
}
