import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,1,2,4,5};
        for(int i = 0; i < answers.length; i++) {
            if(answers[i]==i%5+1) answer[0]++;
            if(answers[i]==b[i%8]) answer[1]++;
            if(answers[i]==c[i%10/2]) answer[2]++;
        }
        ArrayList<Integer> a = new ArrayList<>();
        
        int max = 0;
        for(int i = 0; i < 3; i++) {
            if(max<answer[i]) max = answer[i];
        }
        
        for(int i = 0; i < 3; i++) {
            if(max==answer[i]) a.add(i+1);
        }
        
        
        return a.stream().mapToInt(i -> i).toArray();
    }
}
