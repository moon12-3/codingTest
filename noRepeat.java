import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[0]);
        int j = 0;
        for(int i = 1; i < arr.length; i++) {
            if(a.get(j)!=arr[i]) {
                a.add(arr[i]);
                j++;
            }
        }
        int answer[] = new int[a.size()];
        for(int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        
        return answer;
    }
}
