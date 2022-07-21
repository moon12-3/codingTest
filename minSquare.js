function solution(sizes) {
    let max = [0,0];
    for(let i = 0; i<sizes.length; i++) {
        if(sizes[i][0]<sizes[i][1]) {
            let temp = sizes[i][0];
            sizes[i][0] = sizes[i][1];
            sizes[i][1] = temp;
        }
        for(let j = 0; j<sizes[i].length; j++)
            if(sizes[i][j]>max[j]) max[j] = sizes[i][j];
    }

    
    return max[0]*max[1];
}