function solution(a, b) {
    var answer = '';
    var str1 = Number(String(a)+String(b));
    var str2 = Number(String(b)+String(a));
    if(str1==str2) answer= str1;
    else {
        answer = (str1>str2)? str1:str2;
    }
    return answer;
}