package test.day0323;

class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv extends Product {
	Tv() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);			// Tv�� ������ 100�������� �Ѵ�.
	}

	public String toString() {	// ObjectŬ������ toString()�� �������̵��Ѵ�.
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����

	void buy(Product p) { //<-b.buy(newTv())�� Tv�� ���ԵǴ� ��
		if(money < p.price) { // money 1000 , p.price 100 => false
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}

		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�."); // p�� ��������-toString ȣ��. so, ��������.(p.String)=>Tv�� ����  
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		b.buy(new Tv()); 
		/* Tv t = new Tv(); 
		b.buy(t); �� �����ϰ� �ּ� �����ڴٴ� ����*/
		b.buy(new Computer());

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}
}
