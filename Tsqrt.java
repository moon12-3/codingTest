class Solution {
    public long solution(long n) {
        long answer = 0;
        if((int)Math.sqrt(n)==Math.ceil(Math.sqrt(n))) {
            long a = (int)Math.floor(Math.sqrt(n))+1;
            return a*a;
        }
        return -1;
    }
}
