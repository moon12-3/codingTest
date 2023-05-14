import java.util.*;

class Solution {
    boolean solution(String s) {
        Queue<Boolean> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            boolean a = s.charAt(i)=='('?false:true;
            if(!q.isEmpty() && !q.peek() && a) q.remove();
            else q.add(a);
        }
        return q.isEmpty()?true:false;
    }
}
