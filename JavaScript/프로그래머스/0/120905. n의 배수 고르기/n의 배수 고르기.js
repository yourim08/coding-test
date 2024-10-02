function solution(n, numlist) {
    var count=0;
    var m=0;
    for(var i of numlist){
        if(i%n==0) count++;
    }
    var answer = new Array(count);
    for(var i of numlist){
        if(i%n==0){
            answer[m]=i;
            m++;
        }
    }
    return answer;
}