package test.day0401;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*1.  �迭�� �ߺ��� �����͸� �����ϰ�  ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (��������½� ������ �������)
arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} */
public class CollectionEx01 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20};
		add(arr); // �ϴ� �޼��忡�� ����ǵ���.	
	}
	
	public static void add(int arr[]) {
		//List Ȱ��
		List list = new ArrayList();
		for(int i : arr) {
			if(list.contains(i)) { // 10�� ������ true, ������ false
				System.out.println(i + " " + "�ߺ�");
			}else {
				list.add(i);
				System.out.println(i + " " + true);
			}
		}
		
		// Set Ȱ��
		Set set = new HashSet();
		for(int i : arr) {
			
			String result = i + " --- " + (set.add(i) ? "true" : "�ߺ�");
			System.out.println(result); // �� ���� true, �ߺ��Ǿ� �������� false-�ߺ�
			
			// System.out.println(i + " --- " + (set.add(i) ? "true" : "�ߺ�")); �� ���� ����ص� ��
		}
	}
}
