function solution(myString, pat) {
    var answer = 0;
    if(new RegExp(pat, "i").test(myString)){
        answer=1;
    }
    return answer;
}