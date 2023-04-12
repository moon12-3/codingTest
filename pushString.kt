class Solution {
    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var j = 0;
        if(A.equals(B)) return 0;
        for(i in 0 until A.length) {
            j++;
            if((A.substring(A.length-i-1, A.length)+A.substring(0, A.length-i-1))==B) return j;
        }
        return -1;
    }
}
