import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < tangerine.length; i++) {
            hs.put(tangerine[i], hs.getOrDefault(tangerine[i], 0)+1);
        }
        
        int[] a = hs.values().stream().mapToInt(i->i).toArray();
        
       
        Arrays.sort(a);
        
        int i = a.length-1;
        while(k>0) {
            k-=a[i--];
            answer++;
        }
        
        
        return answer;
    }
}
