function solution(strlist) {
    var answer = new Array(strlist.length);
    var n = 0;
    for(var i=0; i<strlist.length; i++){
        answer[n] = strlist[i].length;
        n++;
    }
    return answer;
}