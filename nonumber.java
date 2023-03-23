import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int c = 0;
        for(int i = 0; i<numbers.length; i++) {
            for(int j = c; j<10; j++) {
                if(j==numbers[i]) {
                    for(int z = c; z<j; z++) {
                        answer+=z;
                    }
                    c = j+1;
                }
            }
        }
        for(int i = c; i < 10; i++) answer+=i;
        return answer;
    }
}
