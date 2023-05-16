import java.util.*;

class Solution {
    public Integer[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new LinkedHashMap<>();

        for(int i = 0; i < id_list.length; i++) {
            hm.put(id_list[i], 0);
            hm2.put(id_list[i], 0);
        }

        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < report.length; i++) {
            hs.add(report[i]);
        }

        Iterator<String> iter = hs.iterator();

        while(iter.hasNext()) {
            String i = iter.next();
            String a = i.substring(i.indexOf(' ')+1);
            hm.put(a, hm.get(a)+1);
        }

        iter = hs.iterator();

        while(iter.hasNext()) {
            String i = iter.next();
            String a = i.substring(i.indexOf(' ')+1);
            String b = i.substring(0, i.indexOf(' '));
            if(hm.get(a)>=k) hm2.put(b, hm2.get(b)+1);
        }

        return hm2.values().toArray(new Integer[0]);
    }
}
