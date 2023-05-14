class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 2; i <= n; i++) {
            int j;
            if(i%2==0) continue;
            boolean k = false;
            for(j = 2; j <= (int)Math.sqrt(i); j++) {
                if(i%j==0) {
                    k = true;
                    break;
                }
            }
            if(!k) answer++;
        }
        return answer;
    }
}
