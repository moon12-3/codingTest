class Solution {
    public long solution(int n) {
        long answer = 0;
        int a = 3;
        int b = 1;
        long c = 0;
        long d;
        while(n/a!=0) {
           b++;
           a*=3;
        }
        a/=3;
        d = a;
        for(int i = b; i>0; i--) {
           c*=10;
           c+=n/a;
           n%=a;
           a/=3;
        }
        
        for(int i = 0; i < b; i++) {
           answer+=c%10*d;
           d/=3;
           c/=10;
        }
        
        return answer;
    }
}
