package test.day0321HW;
/* [����] */
public class Main {
	public static void main(String[] args) {
//1-2�� ����
		Mycard card = new Mycard();
		card.num = 1;
		card.isGwang = true;
		
		System.out.println(card.num);
		System.out.println(card.isGwang);
		
		
//3-4�� ����
		Student s1= new Student();
		s1.name = "��ȿ��";
		s1.age = 28;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		

//5-6�� ����
		MobilePhone m1 = new MobilePhone();
		m1.width = 7.5;
		m1.length = 23.5;
		m1.thickness = 0.7;
		m1.color = "White";
		m1.brand = "Apple";
		
		m1.width = 6.0; //width �� ����
		
		System.out.println(m1.width);
		System.out.println(m1.length);
		System.out.println(m1.thickness);
		System.out.println(m1.color);
		System.out.println(m1.brand);


//7-8�� ����
		GlobalStudent gs1 = new GlobalStudent();
		gs1.name = "��ȿ��";
		gs1.color = "navy";
		
		GlobalStudent gs2 = new GlobalStudent();
		gs2.name = "�ٲ�";
		gs2.color = "brown";
		
		GlobalStudent gs3 = new GlobalStudent();
		gs3.name = "����";
		gs3.color = "yellow";
		
		System.out.println("�̸� : " + gs1.name +"\t" + "�� ���� : " + gs1.color);
		System.out.println("�̸� : " + gs2.name +"\t" + "�� ���� : " + gs2.color);
		System.out.println("�̸� : " + gs3.name +"\t" + "�� ���� : " + gs3.color);
		
	}
}
