function solution(a, b) {
    var answer = '';
    var s1 = Number(String(a)+String(b));
    var s2 = Number(String(b)+String(a));
    if(s1==s2) answer= s1;
    else {
        answer = (s1>s2)? s1:s2;
    }
    return answer;
}