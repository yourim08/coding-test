function solution(chicken) {
    let answer = 0;
    let coupoun=chicken;
    while(true){
        if(coupoun<10) break;
        answer+=Math.floor(coupoun/10);
        coupoun=coupoun%10+Math.floor(coupoun/10);
    } 
    return answer;
}