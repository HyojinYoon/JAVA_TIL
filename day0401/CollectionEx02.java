package test.day0401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*2. Set �迭�� Ŭ������ �̿��Ͽ� �ζǹ�ȣ�� �����Լ��� �̿��Ͽ� �����ϰ�  
List�迭�� Ŭ������ �̿��Ͽ� �����Ͽ� ����ϴ� �ζǱ��� ���α׷��� �ۼ��Ͻÿ�.
- �ݾ��� �Է¹޾� �ݾ׸�ŭ �ζ� ��ȣ ���� (�ݾ� 1000�� ����)*/
public class CollectionEx02 {
	static Scanner s = new Scanner(System.in); // �ݾ� �Է� �ޱ� ����
	public static void main(String[] args) {
		buyLotto(); // buyLotto�޼��� ȣ��
	}
	
	public static void buyLotto() {
		System.out.print("���Աݾ� �Է�: ");
		int money = s.nextInt();
		int amount = money/1000; //int ������ int�� ������ �Ҽ��� �ȳ���
		s.nextLine();
		System.out.println("�ζ� ���� �ݾ� : " + money + "��");
		System.out.println("�ζ� ��ȣ " + amount + "ȸ ���");
		lottoNum(amount);
	}
	
	public static void lottoNum(int amount) { //�Ű������� Ƚ�� �Է�. Ƚ����ŭ �ζǹ�ȣ ����ϰڴٴ� ��
		//list Ȱ��
		for(int a= 0; a < amount; a++) { // ��ü ���� Ƚ��
			Set set = new HashSet(); 
			for (int i = 0; set.size() < 6; i++ ) {			
				int num = (int)(Math.random()*45) + 1; 
				set.add(new Integer(num));
			}
			ArrayList list = new ArrayList(set);
			Collections.sort(list);
			System.out.println("��ȣ" + " : " + list);
		
		
		// TreeSet Ȱ��
	/*	for(int a= 0; a < amount; a++) { // ��ü ���� Ƚ��
		TreeSet set = new TreeSet(); // TreeSet�� �̿��ϸ� �˾Ƽ� ������ ���� - List�迭�� �̿��ؼ� ������ �϶�� �߱� ������ ���x
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; 
			set.add(new Integer(num));
			}
		System.out.println(set); */
		}
	}
}
