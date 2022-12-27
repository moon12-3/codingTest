import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < people.length-1; i++) {
            for(j = people.length-1; j >= i+1 ; j--) {
                if(people[i]+people[j]<=limit) {
                    people[i] = limit*2;
                    people[j] = limit*2;
                    cnt++;
                    break;
                }
            }
        }
        
        for(int i = 0; i < people.length; i++) {
            if(people[i]!=limit*2) cnt++;
        }
        
        return cnt;
    }
}
