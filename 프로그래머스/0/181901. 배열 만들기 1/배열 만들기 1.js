function solution(n, k) {
    var answer = [n/k];
    let m=0;
    for(let i=1; i*k<=n;i++){
        if(i*k<=n) {
            answer[m]=i*k;
            m++;
        }
    }
    return answer;
}