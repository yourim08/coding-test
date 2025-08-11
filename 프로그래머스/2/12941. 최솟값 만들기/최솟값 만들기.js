function solution(A,B){
    var answer = 0;
    A = new Int32Array(A).sort((a, b) => a - b);
    B = new Int32Array(B).sort((a, b) => a - b);
    for(let i=0; i<A.length; i++){
        answer += A[i]*B[B.length-i-1];
    }
    return answer;
}