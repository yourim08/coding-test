function solution(x, n) {
    var answer = new Array(n);
    for(let i=0; i<answer.length; i++){
            answer[i]=x+(x*i);
    }
    return answer;
}