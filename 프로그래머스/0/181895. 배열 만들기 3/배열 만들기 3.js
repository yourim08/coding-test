function solution(arr, intervals) {
    var answer = [];
    var answer = [(intervals[0][1]-intervals[0][0])+
                           (intervals[1][1]-intervals[1][0])+2];
    let n=0;
    let m=0;
    for(let i=0; i<intervals.length;i++){
        for(let j=intervals[i][0]; j<=intervals[i][1];j++){
            answer[m]=arr[j];
            m++;
        }
    }
    return answer;
}