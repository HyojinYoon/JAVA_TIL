package test.day0329;
class Person{
	long id;			// p1.equals(p2)
	public boolean equals(Object obj){  // equals �޼��� �������̵� / obj = p2�� �ּ�
		boolean result = false;
		if(obj !=null && obj instanceof Person){ // true && true
			Person p = (Person)obj; // p = p2�� �ּ�
			result = id == p.id; // p1�� id(this.id) == p2�� id			
		}
		return result;
	}
	Person(long id){
		this.id=id;
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1 == p2){ // �ּҸ� ��
			System.out.println("p1 �� p2 �� ���� ����̴�.");
		}else{
			System.out.println("p1 �� p2 �� �ٸ� ����̴�.");
		}

		if(p1.equals(p2)) // id�� ��
			{
				System.out.println("p1 �� p2 �� ���� ����̴�.");
		}else{
			System.out.println("p1 �� p2 �� �ٸ� ����̴�.");
		}
	}
}
