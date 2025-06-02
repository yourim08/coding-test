function solution(arr, query) {
    var answer = arr;
    let n = 0;
    for (let i of query) {
        if(n%2==0){
            answer = answer.slice(0, i+1)
        }
        else{
            answer = answer.slice(i)
        }
        n++;
    }
    return answer;
}