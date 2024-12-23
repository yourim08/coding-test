function solution(arr) {
    var answer = [];
    let sum=0;
    for(let i=0; i<arr.length;i++){
            sum+=arr[i];
        }
    let n=0;
    var answer = [sum];
    for(let i=0; i<arr.length;i++){
        for(let j=0; j<arr[i] ;j++){
            answer[n]=arr[i];
            n++;
        }
    }
    return answer;
}