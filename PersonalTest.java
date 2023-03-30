class Solution {
    public String solution(String[] survey, int[] choices) {
        int n[][] = new int[4][2];
        char[] p = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(int i = 0; i < choices.length; i++) {
            for(int j = 0; j < 8; j++) {
                if(survey[i].charAt(0)==p[j]) {
                    if(choices[i]>4) {  // 동의(뒤)
                        n[j/2][(j+1)%2]+=choices[i]-4;
                    }
                    else if(choices[i]<4){  // 비동의(앞)
                        n[j/2][j%2]+=4-choices[i];
                    }
                    continue;
                }
            }
        }
        String answer = "";
        for(int i = 0; i < 4; i ++) {
            if(n[i][0]<n[i][1]) answer+=p[i*2+1];
            else answer+=p[i*2];
        }
        return answer;
    }
}
