package test.day0317;

public class Person {
	String name; // �̸�
	int age; // ����
	int height; // Ű
	int weight; // ������
	int birthday; // ����
	String addr; // �ּ�

	// Person(){}
	Person(String n){
		name = n;
	}
	Person(int a){
		age = a;
	}
		
	/*Person(String r){ -> ������ Ÿ���� �Ȱ��� �� �� ����
		addr = r  } */
		
    Person(String ad, int b){
    	addr = ad;
    	birthday = b;
    }
}
