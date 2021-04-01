package test.day0401;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*1.  배열에 중복된 데이터를 제거하고  출력하는 프로그램을 작성하시오. (데이터출력시 순서는 상관없음)
arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} */
public class CollectionEx01 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20};
		add(arr); // 하단 메서드에서 실행되도록.	
	}
	
	public static void add(int arr[]) {
		//List 활용
		List list = new ArrayList();
		for(int i : arr) {
			if(list.contains(i)) { // 10이 있으면 true, 없으면 false
				System.out.println(i + " " + "중복");
			}else {
				list.add(i);
				System.out.println(i + " " + true);
			}
		}
		
		// Set 활용
		Set set = new HashSet();
		for(int i : arr) {
			
			String result = i + " --- " + (set.add(i) ? "true" : "중복");
			System.out.println(result); // 들어간 것은 true, 중복되어 못들어간것은 false-중복
			
			// System.out.println(i + " --- " + (set.add(i) ? "true" : "중복")); 한 번에 출력해도 됨
		}
	}
}
