package test.day0331;

import java.util.*;

class HashMapEx2 {
   public static void main(String[] args){
      HashMap map = new HashMap(); // Map - put/get   // List - add
      map.put("���ڹ�", new Integer(100));
      map.put("���ڹ�", new Integer(100));
      map.put("���ڹ�", new Integer(80));
      map.put("���ڹ�", new Integer(90));
      
      Set set = map.entrySet(); // map�� set���� �ٲ㼭 ����
            
      System.out.println(set);
      Iterator it = set.iterator(); // iterator : �ݺ���

      while(it.hasNext()) { // hasNext : ù���縦 ����Ű�� Ŀ���� �ֳ�. ���������� �������� Ŀ�� �Ҹ� (������ true, ������ false)
         Map.Entry e = (Map.Entry)it.next(); // Map.Entry : set�� �ִ� ���� Map���� ���� / next : �������ְ� ���������� ������
         System.out.println("�̸� : "+ e.getKey() + ", ���� : " + e.getValue());
      }
      set = map.keySet(); // key�� ����
      System.out.println("������ ��� : " + set);

      Collection values = map.values(); // values�� ����Ÿ���� Collection
      it = values.iterator();

      int total = 0;

      while(it.hasNext()) {
         Integer i = (Integer)it.next(); // next : ����
         total += i.intValue();
      }

      System.out.println("���� : " + total);
      System.out.println("��� : " + (float)total/set.size());
      System.out.println("�ְ����� : " + Collections.max(values));
      System.out.println("�������� : " + Collections.min(values));
   }
}