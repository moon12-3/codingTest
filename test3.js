function solution(arr, divisor) {
    var answer = arr.filter(a => !(a%divisor))
    if(answer.length==0) answer.push(-1);
    return answer.sort((a, b) => a-b);
}