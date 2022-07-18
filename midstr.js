function solution(s) {
    let len = Math.floor(s.length/2);
    if(s.length%2==0) return s.slice(len-1, len+1);
    else return s.substr(len, 1);
}