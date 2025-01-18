function solution(x) {
    var answer = true;
    var x1 = String(x);
    var sum=0;
    for(let i=0; i<x1.length; i++){
        sum+=Number(x1.charAt(i));
    }
    if(x%sum!=0) answer=false;
    return answer;
}