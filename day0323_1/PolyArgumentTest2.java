package test.day0323_1;

class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {} // �⺻ ������
}
 
class Tv extends Product {
	Tv() {
		super(100);	
	}

	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }

	public String toString() { return "Audio"; }
}

class Buyer {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭(0~9 ��� null�� ����)
	int i =0;			// Product�迭�� ���� ī����

	void buy(Product p) { //p = new Tv()
		if(money < p.price) { // m = 1000 price = 100
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;		        // ��ǰ�� Product[] item�� �����Ѵ�. - ������ = item[0]�� p���� => Tv
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {		    // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;		 	// ������ ��ǰ�� �����հ�
		String itemList =""; 	// ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.length;i++) { //item.length = 10
			if(item[i]==null) break; //i[0]���� Tv�� ����. i[1]=computer i[2]=audio i[3]=null
			sum += item[i].price; // Tv.price = 100
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}
