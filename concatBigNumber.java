import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) strNums[i] = ""+numbers[i];
        
        Arrays.sort(strNums, Collections.reverseOrder());
        
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                String s1 = strNums[i];
                String s2 = strNums[j];
                if((s1+s2).compareTo(s2+s1)<0) {
                    strNums[i] = s2;
                    strNums[j] = s1;
                }
            }
        }
        
        for(int i = 0; i < numbers.length; i++) answer += strNums[i];
        
        return answer;
    }
}
