function solution(strArr) {
    var answer = strArr.filter((e) => !e.includes("ad"));
    return answer;
}