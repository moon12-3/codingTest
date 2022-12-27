import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int answer[] = new int[commands.length];
        for(int q = 0; q < commands.length; q++) {
            int i = commands[q][0], j = commands[q][1], k = commands[q][2];
            int a[] = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(a);
            answer[q] = a[k-1];
        }
        return answer;
    }
}
