class Solution {
    public int solution(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        long answer = 0;
        long one = 0;
        long two = 1;
        for(int i = 0; i < n-1; i++) {
            answer = one+two%1234567;
            one = two%1234567;
            two = answer%1234567;
        }
        return (int)(answer%1234567);
    }
}
