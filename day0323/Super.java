package test.day0323;
// ����
public class Super {
	int x;
	int y;
	
	Super(){ // �⺻������ - �Ű������� ���� ������
		this(100,200); // �ڽ��� �ٸ� ������ ȣ��!
		/*x = 100;
	      y = 200; */
	}
	
	Super(int x, int y){
		this.x = x;
		this.y = y;
	}	
	
	void add() { //�޼ҵ�
		System.out.println("Super ����");
	}
	
	//����������
	//���
	public static int a = 100; 
	//���� ��Ű��, �ٸ� ��Ű���� �ڼ�
	protected static int b = 100; 
	//���� ��Ű��
	 		  static int c = 100;
	//�ڱ� Ŭ����
	private static int d = 100;
}
