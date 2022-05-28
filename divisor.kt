class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left ..right) {
            var cnt = 1
            for(j in 1 ..i/2) {
                if(i%j==0) cnt++
            }
            answer+= if(cnt%2==0) i
            else -i
        }
        return answer
    }

    fun main(args:Array<String>) {
        println(solution(13, 17))

    }
}

