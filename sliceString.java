class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = '1';
        int tmp = 0;
        for(int i = 0; i < s.length(); i++) {
            if(tmp==0) {
                first = s.charAt(i); 
                answer++;
            }
            if(first==s.charAt(i)) tmp++;
            else tmp--;
        }
        return answer;
    }
}
