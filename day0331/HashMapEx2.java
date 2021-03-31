package test.day0331;

import java.util.*;

class HashMapEx2 {
   public static void main(String[] args){
      HashMap map = new HashMap(); // Map - put/get   // List - add
      map.put("김자바", new Integer(100));
      map.put("이자바", new Integer(100));
      map.put("강자바", new Integer(80));
      map.put("안자바", new Integer(90));
      
      Set set = map.entrySet(); // map을 set으로 바꿔서 대입
            
      System.out.println(set);
      Iterator it = set.iterator(); // iterator : 반복자

      while(it.hasNext()) { // hasNext : 첫번재를 가르키는 커서가 있냐. 마지막까지 내려가면 커서 소멸 (있으면 true, 없으면 false)
         Map.Entry e = (Map.Entry)it.next(); // Map.Entry : set에 있는 것을 Map으로 변경 / next : 추출해주고 다음것으로 내려감
         System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
      }
      set = map.keySet(); // key만 리턴
      System.out.println("참가자 명단 : " + set);

      Collection values = map.values(); // values의 리턴타입이 Collection
      it = values.iterator();

      int total = 0;

      while(it.hasNext()) {
         Integer i = (Integer)it.next(); // next : 추출
         total += i.intValue();
      }

      System.out.println("총점 : " + total);
      System.out.println("평균 : " + (float)total/set.size());
      System.out.println("최고점수 : " + Collections.max(values));
      System.out.println("최저점수 : " + Collections.min(values));
   }
}