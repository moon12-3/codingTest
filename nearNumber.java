import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            answer[i] = hs.getOrDefault(s.charAt(i), -1);
            if(answer[i]!=-1) answer[i] = i-answer[i];
            hs.put(s.charAt(i), i);
        }
        return answer;
    }
}
