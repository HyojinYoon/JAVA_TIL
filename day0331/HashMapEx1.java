package test.day0331;

import java.util.*;

class HashMapEx1{
   public static void main(String[] args) {
      HashMap map = new HashMap();
      map.put("java", "1234"); // key = id , �� = pw
      map.put("asdf", "1111");
      map.put("asdf", "1234");
      map.put(100, "abcd");
      
      System.out.println(map);

      Scanner s = new Scanner(System.in); // ScannerŬ������ �Է¹޴� ���� ����.����
      // ȭ�����κ��� ���δ����� �Է¹޴´�.
      while(true) {
         System.out.println("id�� password�� �Է����ּ���.");
         System.out.print("id :");
         
         String id = s.nextLine().trim(); // trim : ��������
         System.out.print("password :");
         
         String password = s.nextLine().trim();
         System.out.println();
         
         if(!map.containsKey(id)) { // �ش� �ʿ� key�� �ִ���
            System.out.println("id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
            continue;
         } else {
            if(!(map.get(id)).equals(password)) { // equals : �ش� value�� ��
             System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
            } else {
               System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");                  
               break;
            }}} } }
