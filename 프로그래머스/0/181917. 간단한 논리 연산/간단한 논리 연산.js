function solution(x1, x2, x3, x4) {
    var answer = true;
    let flag1 = true;
    let flag2 = true;
    let flag3 = true;
    if(x1==true || x2==true) flag1 = true;
    else flag1 = false;
    if(x3==true || x4==true) flag2 = true;
    else flag2 = false;
    if(flag1==false || flag2==false) answer=false;
    return answer;
}