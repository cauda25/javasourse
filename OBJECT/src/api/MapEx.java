package api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx {
    public static void main(String[] args) {
        // <key 타입, value타입>
        Map<String, String> map = new HashMap<>();

        // 추가 : put()
        map.put("myId", "1234");
        map.put("asdf", "1234");
        map.put("asdf", "1111");

        // 특정 key에 해당하는 value 가져오기
        System.out.println("myId value = " + map.get("myId"));
        System.out.println("myId 포합 여부 = " + map.containsKey("myId"));
        System.out.println("1111 포함 여부 = " + map.containsValue("1111"));

        // 전체 key만 가져오기
        Set<String> set = map.keySet();
        System.out.println(set);

        // 전체 value만 가져오기
        Collection<String> value = map.values();
        System.out.println(value);

        // map 요소 접근
        // 방법1
        Set<Entry<String, String>> set2 = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 방법2
        // key만 Iterator로 변경
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String id = iterator2.next();
            String valu = map.get(id);
            System.out.println(id + " : " + valu);
        }
    }
}
