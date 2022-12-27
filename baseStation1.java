class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int[] apart = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(c==stations.length) break;
            if(i==stations[c]-1) {
                int min = (i-w>0)?i-w:0;
                int max = (i+w<n-1)?i+w:n-1;
                for(int z = min; z <= max; z++) 
                    apart[z] = 1;
                c++;
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(apart[i]==0) {
                boolean a = true;
                for(int j = i; j <= i+w; j++) {
                    if(j<n)
                        if(apart[j]!=0) a = false;
                }
                if(a) i = i+w;
                int min = (i-w>0)?i-w:0;
                int max = (i+w<n-1)?i+w:n-1;
                for(int z = min; z <= max; z++) {
                    apart[z] = 1;
                }
                answer++;
            }
        }
        
        return answer;
    }
}
