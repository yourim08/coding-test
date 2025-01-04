function solution(order) {
    let answer = 0;
    let a=String(order);
    for(let i=0 ; i<a.length ; i++){
        if(a.charAt(i)=='3' ||a.charAt(i)=='6' ||a.charAt(i)=='9') answer++;
    }
    return answer;
}