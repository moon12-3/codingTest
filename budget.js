function solution(d, budget) {
    var cnt = 0;
    d.sort((a, b) => a-b);
    for(let i = 0; i<d.length; i++) {
        if((budget-=d[i])<0) break;
        cnt++;
    }
    return cnt;
}