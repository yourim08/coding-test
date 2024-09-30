function solution(n) {
    var count=0;
    var m=0;
    for(var i=1; i<=n; i++){
        if(i%2!=0) {
            count++;
        }
    }
    var answer = count;
    var answer = new Array(count);
    for(var i=1; i<=n ; i++){
        if(i%2!=0) {
            answer[m]=i;
            m++;
        }
    }
    return answer;
}