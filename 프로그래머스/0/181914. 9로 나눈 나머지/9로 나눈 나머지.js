function solution(number) {
    var answer = 0;
    for (x of number){
        answer += Number(x)
    }
    answer = answer%9
    return answer;
}