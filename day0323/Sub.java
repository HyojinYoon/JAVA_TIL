package test.day0323;

public class Sub extends Super{ // ���
	int x;
	int z;
	
	Sub(){ // ������
		super(700, 800); // ������ �����ڸ� ȣ���ؼ� ����
		this.z = 300;
		//this(300); // �ڱ� ������ ȣ��(super/this�� ���� ��� �Ұ�.ù �ٿ� �;��ϴ� Ư¡)
		//this.x = 700; // �ڼտ��� ������ ������ �ʱ�ȭ(��õ�ϴ� ����� x)
		this.y = 800;
	}
	Sub(int z){
		this.z = z;
	}
	//�޼��� �������̵� (������)
	// ����Ÿ�� / �̸� / �Ű������� �Ȱ��� �ϸ�, �޼��� ���븸 �����ϴ� ��
	void add() { //����� �Ȱ��� add �̸��� �޼��� - �޼���� this, super�� ���� �Ұ� => �ڼ��� ������ ȿ�� **�������̵�
		System.out.println("�������̵� Sub �ڼ�");
	}
	public void add(int x) { // �����ε�
		
	}
	
	void sum() { //�޼���
		int x = 10; // ��������
		System.out.println(x); //���������� / ���������� ���� ������ this.x������ ����. this.x�� ���� ������ super�� �ִ� x ��.
		System.out.println(super.x); //Super ����
		System.out.println(super.y); //Super ���� 
		System.out.println(this.x); //Sub �ڽ�-�ڽŲ�
		System.out.println(this.z); //sub�ڽ�-�ڽŲ��� this
	}
}
