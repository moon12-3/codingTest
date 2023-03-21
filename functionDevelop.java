import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> a = new ArrayList<>();
        int day[] = new int[progresses.length];
        int j = 0;
        for(int i = 0; i < progresses.length; i++) {
            int pro = progresses[i];
            while(pro<100) {
                pro+=speeds[i];
                day[i]++;
            }
        }
        
        int d = 1;
        j = 0;
        
        for(int i = 1; i < day.length; i++) {
            if(day[i]<=day[j]) {
                d++;
            }
            else{
                a.add(d);
                j+=d;
                d = 1;
            }
        }
        
        a.add(d);
        
        int answer[] = new int[a.size()];
        
        j = 0;
        for(int i : a) {
            answer[j++] = i;
        }
        
        return answer;
    }
}


