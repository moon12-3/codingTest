function solution(arr)
{
    let answer = [];
    let cnt = 0;
    for(let i = 0; i<arr.length-1; i++) {
        if(i==0) { 
            answer[cnt++] = arr[i];
            if(arr[i]!=arr[i+1]) answer[cnt++] = arr[i+1];
            continue;
        }
        if(arr[i]==arr[i+1]) continue;
        else answer[cnt++] = arr[i+1];
    }



    return answer;
}