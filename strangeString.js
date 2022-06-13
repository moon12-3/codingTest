function solution(s) {
    var answer = '';
    let cnt = 0;
    for(let i of s) {
        if(i===' ') {
            cnt = 0;
            answer+=' ';
            continue;
        }
        if(!(cnt%2)) answer+=i.toUpperCase();
        else answer+=i.toLowerCase();
        cnt++;

    }
    return answer;
}