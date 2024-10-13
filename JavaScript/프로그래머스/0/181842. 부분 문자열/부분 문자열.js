function solution(str1, str2) {
    var answer = 0;
    var flag= str2.indexOf(str1);
    if(flag!=-1) answer = 1;
    return answer;
}