class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int c = 0;
        
        while(position<=n) {
            if(c < stations.length && stations[c]-w <= position) {
                position= stations[c]+w+1;
                c++;
            } else {
                answer++;
                position += 2*w+1;
            }
        }
        
        return answer;
    }
}
