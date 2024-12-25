function solution(n) {
    let count=0;
    let origin=n;
    while (true){
        if(n==1) break;
        if(n%2==0) {
            n=n/2;
            count++;
        }
        else {
            n=n*3+1;
            count++;
        }
    }
    var answer = new Array(count+1);
    answer[0]=origin;
    for(let i=1 ; i<answer.length;i++){
        if(answer[i-1]%2==0) {
            answer[i]=answer[i-1]/2;
        }
        else {
            answer[i]=answer[i-1]*3+1;
        }
    }
    return answer;
}