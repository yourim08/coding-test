function solution(n) {
    var count = 0;
    for(var i=1; i<=n; i++){
        if(n%i==0) {
            count++;
        }
    }
    var answer = new Array(count);
    var m = 0;
    for(var i=1; i<=n; i++){
        if(n%i==0) {
            answer[m]=i;
            m++;
        }
    }
    return answer;
}