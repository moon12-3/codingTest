fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 0;
    for(i in absolutes.indices) {
        answer+= if(signs[i]) absolutes[i]
        else -absolutes[i]
    }
    return answer
}

fun main(args: Array<String>) {
    var value = solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true))
    println(value)
}


