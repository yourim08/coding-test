function solution(before, after) {
    var answer = 0;
    let str1 = before.split('').sort().join('');
    let str2 = after.split('').sort().join('');
    if(str1.includes(str2)) {
        answer=1;
    }
    return answer;
}