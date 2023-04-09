class Solution {
    public String solution(int a, int b) {
        int[] c = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] w = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int an = b;
        for(int i = 1; i<a; i++) {
            an+=c[i-1];
        }
        
        return w[an%7];
    }
}
