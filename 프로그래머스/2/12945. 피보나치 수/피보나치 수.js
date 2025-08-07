function solution(n) {
    var answer = 1;
    let former = 0;
    let next = 1;
    for(let i=0; i<n-1; i++){
        answer = (next+former) % 1234567;    
        former = next;
        next = answer;
    } 
    return answer;
}