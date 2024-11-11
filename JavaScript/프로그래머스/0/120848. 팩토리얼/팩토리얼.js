function solution(n) {
    var answer = 0;
    let m=1;
    let k=1;
    let j=2;
    while(true){
        k*=j;
        if(k>n) {
            answer=(j-1);
            break;
        }
        else j++;
    }
    return answer;
}