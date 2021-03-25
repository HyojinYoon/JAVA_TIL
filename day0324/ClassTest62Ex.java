package test.day0324;
//��ӹ���
/*
	#1. 
	�Ʒ� main()�޼ҵ� #1���� �Ʒ� �������� �����Ͽ� TVClass�� ��ӹ��� ColorTVŬ������ �ۼ��ϼ���. 
	������ : 32��ġ 1024�÷�
	
	#2. �� 1�� ������ Ǭ��, main()�޼ҵ� #2���� �Ʒ� �������� �����Ͽ� ColorTV�� ��ӹ޴�  IPTVŬ������ �ۼ��ϼ���.
	������ : ���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�
*/
class TVClass {
	private int size;
	public TVClass(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TVClass{
	private int color; //size�� TVClass�� �־ color �߰� ����
	public TVClass(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty() {
		System.out.println(this.getSize()+"��ġ");
	}
}

public class ClassTest62Ex {
	public static void main(String[] args) {
		//#1. 
		//ColorTV myTV = new ColorTV(32, 1024);
		//myTV.printProperty();
		
		//#2. 
		//IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048);
		//iptv.printProperty();
		
	}
}
