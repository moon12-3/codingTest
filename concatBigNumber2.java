import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNums = new String[numbers.length];
        boolean except = true;
        
        for(int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
            if(numbers[i]!=0) except = false;
        }
        
        if(except) return "0";
        
        Arrays.sort(strNums, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        
        for(int i = 0; i < numbers.length; i++) answer += strNums[i];
        
        return answer;
    }
}
