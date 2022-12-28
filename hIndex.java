import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Integer c[] = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        
        Arrays.sort(c, Collections.reverseOrder());
        
        int answer = 0;
        for(int i = 0; i < citations.length; i++) {
            if(i+1>c[i]) break;
            answer++;
        }
        
        return answer;
    }
}
