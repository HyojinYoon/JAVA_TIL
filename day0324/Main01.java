package test.day0324;

public class Main01 {
	public static void main(String[] args) {
		
		Runner r1 = new Runner();
		Runable r2 = r1;
		Startable r3 = (Startable)r2;
		
		r1.name();
		System.out.println(r1.speed());
		
		
		r2.name();
		System.out.println(r3.speed());
		
	}
}
