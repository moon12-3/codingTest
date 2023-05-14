import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hs = new HashMap<>();
        for(int i = 0; i <= discount.length-10; i++) {
            for(int j = 0; j < want.length; j++) {
                hs.put(want[j], number[j]);
            }
            for(int j = i; j < i+10; j++)
                if(hs.containsKey(discount[j])) hs.put(discount[j], hs.get(discount[j])-1);
            boolean isTrue = true;
            for(int j = 0; j < want.length; j++) {
                if(hs.get(want[j])!=0) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) answer++;
        }
        return answer;
    }
}
