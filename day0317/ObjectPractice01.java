package test.day0317;

public class ObjectPractice01 
{
	public static void main(String[] args) {
		Person p1 = new Person("�̸�");
		System.out.println(p1.name); //-> �̸� ���
		
		Person p2 = new Person(28);
		System.out.println(p2.age);
	
		Person p3 = new Person("����", 950116);
		System.out.println(p3.addr+"\r\t"+p3.birthday);

	}
}
