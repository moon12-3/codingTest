import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            int c = index;
            char a = s.charAt(i);
            for(int j = 1; j <= c; j++) {
                a++;
                if(a>'z') a=(char)(('a'-1)+a%'z');
                for(int z = 0; z < skip.length(); z++) {
                    if(a==skip.charAt(z)) {
                        c++;
                        break;
                    }
                }
            }
            answer+=a;
        }
        return answer;
    }
}
