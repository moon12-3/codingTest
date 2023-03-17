class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int min = 1000;
        for(int i = 0; i < arr.length; i++) {
            if(min>arr[i]) min = arr[i];
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min==arr[i]) continue;
            answer[j] = arr[i];
            j++;
        }
        
        return answer;
    }
}
