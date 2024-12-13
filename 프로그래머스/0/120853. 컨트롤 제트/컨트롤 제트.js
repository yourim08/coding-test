function solution(s) {
    var answer = 0;
    let parts = s.split(" ");
    for(var i=0; i<parts.length;i++){
        if(parts[i]=="Z") answer-=Number(parts[i-1]);
        else answer+=Number(parts[i]);
    }
    return answer;
}