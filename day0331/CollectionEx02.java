package test.day0331;

import java.util.TreeSet;

/*2. Set �迭�� Ŭ������ �̿��Ͽ� �ζǹ�ȣ�� �����Լ��� �̿��Ͽ� �����ϰ�  
List�迭�� Ŭ������ �̿��Ͽ� �����Ͽ� ����ϴ� �ζǱ��� ���α׷��� �ۼ��Ͻÿ�.
- �ݾ��� �Է¹޾� �ݾ׸�ŭ �ζ� ��ȣ ���� (�ݾ� 1000�� ����)*/
public class CollectionEx02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++ ) {			
			int num = (int)(Math.random()*45) + 1; 
			set.add(new Integer(num));
		}
		System.out.println("��ȣ :" + set);
	}
}
