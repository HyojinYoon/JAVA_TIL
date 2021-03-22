package test.day0321HW;
/* [변수] */
public class Main {
	public static void main(String[] args) {
//1-2번 문제
		Mycard card = new Mycard();
		card.num = 1;
		card.isGwang = true;
		
		System.out.println(card.num);
		System.out.println(card.isGwang);
		
		
//3-4번 문제
		Student s1= new Student();
		s1.name = "윤효진";
		s1.age = 28;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		

//5-6번 문제
		MobilePhone m1 = new MobilePhone();
		m1.width = 7.5;
		m1.length = 23.5;
		m1.thickness = 0.7;
		m1.color = "White";
		m1.brand = "Apple";
		
		m1.width = 6.0; //width 값 변경
		
		System.out.println(m1.width);
		System.out.println(m1.length);
		System.out.println(m1.thickness);
		System.out.println(m1.color);
		System.out.println(m1.brand);


//7-8번 문제
		GlobalStudent gs1 = new GlobalStudent();
		gs1.name = "윤효진";
		gs1.color = "navy";
		
		GlobalStudent gs2 = new GlobalStudent();
		gs2.name = "꾸꾸";
		gs2.color = "brown";
		
		GlobalStudent gs3 = new GlobalStudent();
		gs3.name = "해준";
		gs3.color = "yellow";
		
		System.out.println("이름 : " + gs1.name +"\t" + "옷 색상 : " + gs1.color);
		System.out.println("이름 : " + gs2.name +"\t" + "옷 색상 : " + gs2.color);
		System.out.println("이름 : " + gs3.name +"\t" + "옷 색상 : " + gs3.color);
		
	}
}
