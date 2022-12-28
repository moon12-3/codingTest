import java.util.Arrays;

class Solution {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        for(int i : budgets) answer+=i;
        
        Arrays.sort(budgets);
        
        int a = budgets.length-1;
        while(answer>M) {
            if(a>0 && budgets[a]==budgets[a-1]) a--;
            for(int i = budgets.length-1; i >=a; i--){
                budgets[i]--;
            }
            answer = Arrays.stream(budgets).sum();
        }
        
        return budgets[a];
    }
}
