function solution(n) {
    var answer = 0;
    for(var i=1; i<=n;i++){
        var count=0;
        for(var j=1;j<=i;j++){
            if(i%j==0) count++;
        }
        if(count>=3) answer++;
    }
    return answer;
}