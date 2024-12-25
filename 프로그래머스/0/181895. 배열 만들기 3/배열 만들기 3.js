function solution(arr, intervals) {
    var answer = [];
    var answer = [,,];
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